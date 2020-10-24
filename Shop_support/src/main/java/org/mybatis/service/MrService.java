package org.mybatis.service;

import java.util.List;
import java.util.Map;

import org.mybatis.domain.Bom;
import org.mybatis.domain.Mr;

public interface MrService {
		void insert(Map<String, Object> map);
		List<Mr> list(Mr mr);
		void updateWrCountCur(Mr mr);
		void updateRef(Mr mr);
		Mr selectOne(Mr mr);
		List<Boolean> selectRefs(Mr mr);
}
