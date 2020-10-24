package org.mybatis.persistence;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.domain.Wro;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;
@Repository
public class WroDaoImpl implements WroDao {

	private String namespace = "org.mybatis.persistence.WroMapper.";
	
	@Resource
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public void insert(Wro wro) {
		sqlSessionTemplate.insert(namespace+"insert", wro);
	}
	@Override
	public void update(String lotNumber) {
		sqlSessionTemplate.insert(namespace+"update", lotNumber);
	}
	@Override
	public List<Map> list(Wro wro) {
		return sqlSessionTemplate.selectList(namespace+"list", wro);
	}
	@Override
	public void updateRef(String lotNumber) {
		sqlSessionTemplate.update(namespace+"updateRef", lotNumber);
	}
	
	@Override
	public boolean selectRef(String wroCode) {
		return sqlSessionTemplate.selectOne(namespace+"selectRef", wroCode);
	}

}
