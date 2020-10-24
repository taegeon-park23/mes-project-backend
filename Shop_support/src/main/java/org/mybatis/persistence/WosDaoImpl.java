package org.mybatis.persistence;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.domain.Wo;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class WosDaoImpl implements WosDao {
	@Resource
	private SqlSessionTemplate sqlSessionTemplate;
	private String namespace = "org.mybatis.persistence.WosMapper.";
	
	@Override
	public void insertByWo(Wo wo) {
		sqlSessionTemplate.insert(namespace+"insertByWo", wo);
	}

	@Override
	public List<Map<String, Object>> list(Map<String, Object> requestWos) {
		return sqlSessionTemplate.selectList(namespace+"list", requestWos);
	}
}
