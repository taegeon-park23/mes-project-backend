package org.mybatis.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.domain.Im;
import org.mybatis.persistence.ImDao;
import org.springframework.stereotype.Service;

@Service
public class ImServiceImpl implements ImService {

	@Resource
	ImDao imDao;
	
	@Override
	public void insert(Im im) {
		imDao.insert(im);
	}

	@Override
	public int count(Im im) {
		return imDao.count(im);
	}

	@Override
	public List<Map<String, Object>> list(Im im) {
		return imDao.list(im);
	}

	@Override
	public void updateRef(String imCode) {
		imDao.updateRef(imCode);
		
	}

	@Override
	public boolean selectOverCount(Im im) {
		return imDao.selectOverCount(im);
	}

}
