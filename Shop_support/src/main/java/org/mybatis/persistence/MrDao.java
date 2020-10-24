package org.mybatis.persistence;

import java.util.List;
import java.util.Map;

import org.mybatis.domain.Bom;
import org.mybatis.domain.Mr;

public interface MrDao {
	void insert(Map<String, Object> map);
	List<Mr> list(Mr mr);
	void updateWrCountCur(Mr mr);
	Mr SelectOne(Mr mr);
	void updateRef(Mr mr);
	List<Boolean> selectRefs(Mr mr);
}
