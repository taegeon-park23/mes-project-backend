package org.mybatis.service;

import javax.annotation.Resource;

import org.mybatis.domain.Ware;
import org.mybatis.persistence.WareDao;
import org.springframework.stereotype.Service;

@Service
public class WareServiceImpl implements WareService {

	@Resource
	private WareDao wareDao;
	
	@Override
	public String wrKind(String wrCode) {		
		return wareDao.wrKind(wrCode);
	}

	@Override
	public Ware selectOne(String wrCode) {		
		return wareDao.selectOne(wrCode);
	}

}
