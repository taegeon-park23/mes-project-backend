package org.mybatis.service;

import org.mybatis.domain.Ware;

public interface WareService {
	public String wrKind(String wrCode);

	public Ware selectOne(String wrCode);
}
