package org.mybatis.service;

import java.util.List;
import java.util.Map;

import org.mybatis.domain.Wo;

public interface WoService {
	public void insert(Map<String, Object> map);

	public List<Map> list(Map<String, Object> requestWo);

	public void updateRef(String lotNumber);

	public boolean selectAvailable(Map<String, Object> requestWo);

	public Wo updateWrCurrentCur(Map<String, Object> requestWo);
}
