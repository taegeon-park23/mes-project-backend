package org.mybatis.presentation;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.domain.Im;
import org.mybatis.domain.Mr;
import org.mybatis.domain.Ware;
import org.mybatis.domain.Warehouse;
import org.mybatis.domain.Wo;
import org.mybatis.domain.Wro;
import org.mybatis.service.ImService;
import org.mybatis.service.MrService;
import org.mybatis.service.WareService;
import org.mybatis.service.WarehouseService;
import org.mybatis.service.WoService;
import org.mybatis.service.WosService;
import org.mybatis.service.WroService;
import org.springframework.format.datetime.standard.DateTimeContext;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {
	@Resource
	WroService wroService;
	
	@Resource
	MrService mrService;
	
	@Resource
	ImService imService;
	
	@Resource
	WoService woService;
	
	@Resource
	WarehouseService warehouseService;
	
	@Resource
	WosService wosService;
	
	@Resource
	WareService wareService;
	
	// Insert into Ware Order table
	@RequestMapping(value="/wro/insert", method = RequestMethod.POST)
	public Map<String, String> insert(@RequestBody  Wro wro) throws Exception {
		Date date = new Date();
		String wroCode = wro.getWrCode() +"_"+ date.hashCode();
		System.out.println(wroCode.toUpperCase());
		wro.setWroCode(wroCode.toUpperCase());
		wro.setWroDate(date);
		wro.setRef(false);
		wro.setLotNumber(wroCode);
		
		Ware ware = wareService.selectOne(wro.getWrCode());
		Map<String, String> response = new HashMap<String, String>();
		if(ware == null) {
			response.put("response", "no research the WR_CODE");
			return response;
		}
		
		wroService.insert(wro);
		response.put("response", "success");
		return response;
	}
	
	// Select list of ware from Ware order table
	@RequestMapping(value="/wro/list", method=RequestMethod.POST)
	public List<Map> list(@RequestBody Wro wro) throws Exception {
		return wroService.list(wro);
	}
	
	// Select List of material order from Material Order table 
	@RequestMapping(value="/mr/list", method=RequestMethod.POST)
	public List<Mr> list(@RequestBody Mr mr) throws Exception {		
		return mrService.list(mr);
	}
	
	// insert material story into In Material table
	@Transactional
	@RequestMapping(value="/im/insert", method=RequestMethod.POST)
	public Map<String, Object> insert(@RequestBody Map<String, Object> requestIm) throws Exception {
		// Requested Json data convert to Java object type
		Im im = new Im();
		im.setImCode(requestIm.get("MR_CODE").toString());
		im.setMrCode(requestIm.get("MR_CODE").toString());
		im.setWrCode(requestIm.get("WR_CODE").toString());
		im.setBsnNumber(requestIm.get("BSN_NUMBER").toString());
		im.setWrCount(Integer.parseInt(requestIm.get("WR_COUNT_CUR").toString()));
		im.setImDate(new Date());
		im.setRef(false);
		im.setLotNumber(requestIm.get("LOT_NUMBER").toString());
		
		// Confirm requested 'WR_COUNT_CUR' is over the current sum of im's WR_COUNTs.
		Map<String, Object> response = new HashMap<String, Object>(); 
		boolean overCount = imService.selectOverCount(im); 
		if(overCount) {
			response.put("response", "현재 입고 신청된 수량을 확인하세요");
			return response;
		}
		
		int imCount = imService.count(im);
		im.setImCode(im.getImCode()+imCount);
		imService.insert(im);
		
		return null;
	}
	
	
	@Transactional
	@RequestMapping(value="/im/updateRef")
	public void imUpdateRef(@RequestBody Map<String, Object> requestIm) throws Exception {
		
		// update mr's WR_COUNT_CUR column
		Mr mr = new Mr();
		mr.setMrCode(requestIm.get("MR_CODE").toString());
		mr.setWrCountCur(Integer.parseInt(requestIm.get("WR_COUNT").toString()));
		mrService.updateWrCountCur(mr);
		mr = mrService.selectOne(mr);
		
		int wrCount = (Integer)requestIm.get("WR_COUNT");
		// Minus the existing "InMaterial" warehouse count 
		Warehouse warehouse = new Warehouse();
		warehouse.setWrCode(mr.getWrCode());
		warehouse.setWrhCount(-wrCount);
		warehouse.setWrhKind("입고");
		warehouseService.updateWrCount(warehouse);
		
		// Add the "Material" warehouse count
		warehouse.setWrhCount(wrCount);
		warehouse.setWrhKind("원자재");
		warehouseService.updateWrCount(warehouse);
		
		if(mr.getWrCount() == mr.getWrCountCur()) {
			// If requested In material's WO_COUNT is same the 'WO_COUNT_CUR',
			// update Ref column to 'true'
			mrService.updateRef(mr);
			
			// If each ref is all 'true' in ref list, update the 'REF' in WaRe Order Table.
			mr.setLotNumber(requestIm.get("LOT_NUMBER").toString());
			List<Boolean> refs = mrService.selectRefs(mr);
				boolean isAllTrue = true;
				for(boolean ref : refs) {
					if(ref==false) isAllTrue = false;
				}
				if(isAllTrue) {
					// If ref column is 'true' in 'Ware Order' table 
					wroService.updateRef(mr.getLotNumber());
				} 	
		}
		
		imService.updateRef(requestIm.get("IM_CODE").toString());
	}
	
	@RequestMapping(value="/im/list", method=RequestMethod.POST)
	public List<Map<String, Object>> list(@RequestBody Im im) throws Exception {
		return imService.list(im);
	}
	
	@Transactional
	@RequestMapping(value="/wo/list", method=RequestMethod.POST)
	public List<Map> list(@RequestBody Map<String, Object> requestWo) throws Exception {
		return woService.list(requestWo);
	}
	
	@Transactional
	@RequestMapping(value="/wo/update", method=RequestMethod.POST)
	public Map<String, String> update(@RequestBody Map<String, Object> requestWo) throws Exception {
		boolean ref = wroService.selectRef(requestWo.get("WRO_CODE").toString());
		Map<String, String> response = new HashMap<String, String>();
		if(ref==false) {response.put("response", "아직 입고가 완료되지 않았습니다."); return response;}
		
		boolean isAvailable = woService.selectAvailable(requestWo);
		if(isAvailable==false) {response.put("response", "창고에 재료가 부족합니다."); return response;}
		
		Wo wo = woService.updateWrCurrentCur(requestWo);
		wo.setWrCountCur(Integer.parseInt(requestWo.get("WR_COUNT_CUR").toString()));
		if(wo != null) {
			wosService.insertByWo(wo);
		}
		return null;
	}
	
	@RequestMapping(value="/wos/list", method=RequestMethod.POST)
	public List<Map<String, Object>> listWos(@RequestBody Map<String, Object> requestWos) throws Exception {
		return wosService.list(requestWos);
	}
	
}
