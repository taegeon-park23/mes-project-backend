package org.mybatis.persistence;

import javax.annotation.Resource;

import org.mybatis.domain.Ware;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class WareDaoImpl implements WareDao {

	@Resource
	private SqlSessionTemplate sqlSessionTemplate;
	private String namespace = "org.mybatis.persistence.WareMapper.";
	@Override
	public String wrKind(String wrCode) {
		return sqlSessionTemplate.selectOne(namespace+"wrKind", wrCode);
	}
	@Override
	public Ware selectOne(String wrCode) {
		return sqlSessionTemplate.selectOne(namespace+"selectOne", wrCode);
	}

}
