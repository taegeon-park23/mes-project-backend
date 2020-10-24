package org.mybatis.service;

import java.util.List;
import java.util.Map;

import org.mybatis.domain.Wro;

public interface WroService {
	public void insert(Wro wro);
	public void update(String lotNumber);
	public List<Map> list(Wro wro);
	public void updateRef(String lotNumber);
	public boolean selectRef(String string);
}
