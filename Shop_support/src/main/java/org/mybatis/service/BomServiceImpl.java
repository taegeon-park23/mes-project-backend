package org.mybatis.service;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.domain.Bom;
import org.mybatis.persistence.BomDao;
import org.springframework.stereotype.Service;

@Service
public class BomServiceImpl implements BomService {

	@Resource
	BomDao bomDao;

	public List<Bom> list(String wrCode) {
		return bomDao.list(wrCode);
	}
}
