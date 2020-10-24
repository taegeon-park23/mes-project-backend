package org.mybatis.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.domain.Bom;
import org.mybatis.domain.Mr;
import org.mybatis.persistence.MrDao;
import org.springframework.stereotype.Service;

@Service
public class MrServiceImpl implements MrService {

	@Resource
	MrDao mrDao;
	@Override
	public void insert(Map<String, Object> map) {
		mrDao.insert(map);
	}
	
	@Override
	public List<Mr> list(Mr mr) {
		return mrDao.list(mr);
	}

	@Override
	public void updateWrCountCur(Mr mr) {
		mrDao.updateWrCountCur(mr);
	}
	
	public void updateRef(Mr mr) {
		mrDao.updateRef(mr);
	}

	@Override
	public Mr selectOne(Mr mr) {
		return mrDao.SelectOne(mr);
	}

	@Override
	public List<Boolean> selectRefs(Mr mr) {
		return mrDao.selectRefs(mr);
	}

}
