package org.mybatis.persistence;

import java.util.List;
import java.util.Map;

import org.mybatis.domain.Wo;

public interface WoDao {
	public void insert(Map<String, Object> map);

	public List<Map> list(Map<String, Object> requestWo);

	public void updateRef(String lotNumber);

	public boolean selectAvailable(Map<String, Object> requestWo);

	public Wo updateWrCurrentCur(Map<String, Object> requestWo);
}
