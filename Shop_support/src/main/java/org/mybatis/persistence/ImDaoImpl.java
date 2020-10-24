package org.mybatis.persistence;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.domain.Im;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ImDaoImpl implements ImDao {
	private String namespace = "org.mybatis.persistence.ImMapper.";
	
	@Resource
	SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public void insert(Im im) {
		sqlSessionTemplate.insert(namespace+"insert", im);
	}

	@Override
	public int count(Im im) {
		return sqlSessionTemplate.selectOne(namespace+"count", im);
	}

	@Override
	public List<Map<String, Object>> list(Im im) {
		return sqlSessionTemplate.selectList(namespace+"list", im);
	}

	@Override
	public void updateRef(String imCode) {
		sqlSessionTemplate.update(namespace+"updateRef", imCode);
	}

	@Override
	public boolean selectOverCount(Im im) {
		return sqlSessionTemplate.selectOne(namespace+"selectOverCount", im);
	}
	
}
