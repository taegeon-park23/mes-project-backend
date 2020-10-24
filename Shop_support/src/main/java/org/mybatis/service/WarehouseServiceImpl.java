package org.mybatis.service;

import javax.annotation.Resource;

import org.mybatis.domain.Warehouse;
import org.mybatis.persistence.WarehouseDao;
import org.springframework.stereotype.Service;

@Service
public class WarehouseServiceImpl implements WarehouseService {
	@Resource
	WarehouseDao warehouseDao;

	@Override
	public void updateWrCount(Warehouse warehouse) {
		warehouseDao.updateWrCount(warehouse);		
	}
}
