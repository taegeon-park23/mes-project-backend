package org.mybatis.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.domain.Wo;
import org.mybatis.persistence.WoDao;
import org.springframework.stereotype.Service;


@Service
public class WoServiceImpl implements WoService {

	@Resource
	WoDao woDao;
	@Override
	public void insert(Map<String, Object> map) {
		woDao.insert(map);
	}
	
	@Override
	public List<Map> list(Map<String, Object> requestWo) {
		return woDao.list(requestWo);
	}
	
	@Override
	public void updateRef(String lotNumber) {
		woDao.updateRef(lotNumber);
		
	}
	
	@Override
	public boolean selectAvailable(Map<String, Object> requestWo) {
		return woDao.selectAvailable(requestWo);
	}
	
	@Override
	public Wo updateWrCurrentCur(Map<String, Object> requestWo) {
		return woDao.updateWrCurrentCur(requestWo);
	}

}
