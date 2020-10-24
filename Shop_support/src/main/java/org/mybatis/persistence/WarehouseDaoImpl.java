package org.mybatis.persistence;

import javax.annotation.Resource;

import org.mybatis.domain.Warehouse;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class WarehouseDaoImpl implements WarehouseDao {
	private String namespace="org.mybatis.persistence.WarehouseMapper.";
	
	@Resource
	SqlSessionTemplate sqlSessionTemplate;

	@Override
	public void updateWrCount(Warehouse warehouse) {
		sqlSessionTemplate.update(namespace+"updateWrCount",warehouse);
		
	}
}
