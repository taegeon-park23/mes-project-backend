package org.mybatis.persistence;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.domain.Bom;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BomDaoImpl implements BomDao {

	private String namespace = "org.mybatis.persistence.BomMapper.";
	@Resource
	SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public List<Bom> list(String wrCode) {
		return sqlSessionTemplate.selectList(namespace+"list", wrCode);
	}

	@Override
	public Bom switchBom(String wrChildCode) {
		return sqlSessionTemplate.selectOne(namespace+"switch", wrChildCode);
	}
	
	
}
