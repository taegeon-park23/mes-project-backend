package org.mybatis.service;

import java.util.List;

import org.mybatis.domain.Bom;

public interface BomService {
	List<Bom> list(String wrCode);
}
