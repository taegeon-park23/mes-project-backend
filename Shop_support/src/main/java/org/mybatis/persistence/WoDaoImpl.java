package org.mybatis.persistence;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.domain.Wo;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class WoDaoImpl implements WoDao{
	private String namespace ="org.mybatis.persistence.WoMapper.";
	
	@Resource
	SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public void insert(Map<String, Object> map) {
		sqlSessionTemplate.insert(namespace+"insert", map);
	}

	@Override
	public List<Map> list(Map<String, Object> requestWo) {
		return sqlSessionTemplate.selectList(namespace+"list", requestWo);
	}

	@Override
	public void updateRef(String lotNumber) {
		sqlSessionTemplate.update(namespace+"updateRef", lotNumber);
	}

	@Override
	public boolean selectAvailable(Map<String, Object> requestWo) {
		return sqlSessionTemplate.selectOne(namespace+"selectAvailable", requestWo);
	}

	@Override
	public Wo updateWrCurrentCur(Map<String, Object> requestWo) {
		sqlSessionTemplate.update(namespace+"updateWrCurrentCur", requestWo);
		return sqlSessionTemplate.selectOne(namespace+"selectByWoCode", requestWo.get("WO_CODE").toString());
	}
	
}
