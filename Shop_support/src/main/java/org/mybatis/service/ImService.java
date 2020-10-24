package org.mybatis.service;

import java.util.List;
import java.util.Map;

import org.mybatis.domain.Im;

public interface ImService {
	public void insert(Im im);
	public int count(Im im);
	public List<Map<String, Object>> list(Im im);
	public void updateRef(String imCode);
	public boolean selectOverCount(Im im);
}
