package org.mybatis.persistence;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.domain.Bom;
import org.mybatis.domain.Mr;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MrDaoImpl implements MrDao {

	private String namespace="org.mybatis.persistence.MrMapper.";
	
	@Resource
	SqlSessionTemplate sqlSessionTemplate;
	@Override
	public void insert(Map<String, Object> map) {
		sqlSessionTemplate.insert(namespace+"insert", map);
	}
	@Override
	public List<Mr> list(Mr mr) {
		return sqlSessionTemplate.selectList(namespace+"list", mr);
	}
	@Override
	public void updateWrCountCur(Mr mr) {
		sqlSessionTemplate.update(namespace+"updateWrCountCur", mr);
	}
	
	@Override
	public void updateRef(Mr mr) {
		sqlSessionTemplate.update(namespace+"updateRef", mr);
	}
	
	@Override
	public Mr SelectOne(Mr mr) {
		return sqlSessionTemplate.selectOne(namespace+"selectOne", mr);
	}
	
	@Override
	public List<Boolean> selectRefs(Mr mr) {
		return sqlSessionTemplate.selectList(namespace+"selectRefs", mr);
	}
	

}
