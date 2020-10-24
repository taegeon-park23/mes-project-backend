package org.mybatis.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.annotation.Resource;

import org.mybatis.domain.Bom;
import org.mybatis.domain.Ware;
import org.mybatis.domain.Warehouse;
import org.mybatis.domain.Wro;
import org.mybatis.persistence.BomDao;
import org.mybatis.persistence.MrDao;
import org.mybatis.persistence.WareDao;
import org.mybatis.persistence.WarehouseDao;
import org.mybatis.persistence.WoDao;
import org.mybatis.persistence.WroDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class WroServiceImpl implements WroService {

	@Resource
	private WareDao wareDao;
	
	@Resource
	private WroDao wroDao;
	
	@Resource
	private BomDao bomDao;
	
	@Resource
	private MrDao mrDao;
	
	@Resource
	private WoDao woDao;
	
	@Resource
	private WarehouseDao warehouseDao;
	
	@Override
	@Transactional
	public void insert(Wro wro) {
		wroDao.insert(wro);
		List<Bom> bomList = bomDao.list(wro.getWrCode());
		List<String> wrParentCodeList = new ArrayList<String>();
		
		int i=0;
		//뽑은 bomList를 통해 MR(Material Order) 작업 수행 
		for(Bom bom : bomList) {
			//wrKind == Bom's wrChildCode의 Ware Kind를 검사
			String wrKind = wareDao.wrKind(bom.getWrChildCode());
			int bomCount = bom.getBomCount();			
			// 원자재가 아니라면
			if(!wrKind.equals("원자재")) {
				// wrKind가 원자재가 될때까지 교체
				wrParentCodeList.add(bom.getWrParentCode());
				while(!wrKind.equals("원자재")) {
					bom = bomDao.switchBom(bom.getWrChildCode());
					bomCount = bomCount * bom.getBomCount();
					wrKind =  wareDao.wrKind(bom.getWrChildCode());
					wrParentCodeList.add(bom.getWrParentCode());
				}
			}
			
			// Material Order, 원자재 발주 인서트
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("mrCode", wro.getWroCode()+(++i));
			map.put("wrCode", bom.getWrChildCode());
			map.put("wrCount", (Integer)(bomCount*wro.getWrCount()));
			map.put("mrDate", wro.getWroDate());
			map.put("ref", false);
			map.put("lotNumber", wro.getLotNumber());
			mrDao.insert(map);
			
			// 원자재 발주, '입고' 상태로  업데이트
			Warehouse warehouse = new Warehouse();
			warehouse.setWrCode(bom.getWrChildCode());
			warehouse.setWrhKind("입고");
			warehouse.setWrhCount((Integer)(bomCount*wro.getWrCount()));
			warehouseDao.updateWrCount(warehouse);
		}
		i=0;
		
		// bom에서 뽑은 wrParentList를 distinct() 하고 리스트화
		wrParentCodeList = wrParentCodeList.stream()
							.distinct()
							.collect(Collectors.toList());

		// 뽑은 리스트를 가지고 WO, Work Order (작업 지시) 인서트
		for(String wrParentCode: wrParentCodeList) {
			Map<String, Object> wo = null;
			wo = new HashMap<String, Object>();
			wo.put("wroCode", wro.getWroCode());
			wo.put("wrCode", wrParentCode);
			woDao.insert(wo);
		}
		i=0;
	}
	
	@Override
	@Transactional
	public void update(String lotNumber) {
		wroDao.update(lotNumber);
	}

	@Override
	public List<Map> list(Wro wro) {
		return wroDao.list(wro);
	}

	@Override
	public void updateRef(String lotNumber) {
		wroDao.updateRef(lotNumber);
	}
	
	@Override
	public boolean selectRef(String wroCode) {
		return wroDao.selectRef(wroCode);
	}

}
