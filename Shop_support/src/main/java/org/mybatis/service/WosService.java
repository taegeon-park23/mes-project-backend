package org.mybatis.service;

import java.util.List;
import java.util.Map;

import org.mybatis.domain.Wo;

public interface WosService {

	void insertByWo(Wo wo);

	List<Map<String, Object>> list(Map<String, Object> requestWos);

}
