package org.mybatis.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.domain.Wo;
import org.mybatis.persistence.WosDao;
import org.springframework.stereotype.Service;

@Service
public class WosServiceImpl implements WosService {
	@Resource
	WosDao wosDao;

	@Override
	public void insertByWo(Wo wo) {
		wosDao.insertByWo(wo);
	}

	@Override
	public List<Map<String, Object>> list(Map<String, Object> requestWos) {
		return wosDao.list(requestWos);
	}
}
