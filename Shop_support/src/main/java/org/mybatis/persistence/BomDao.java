package org.mybatis.persistence;

import java.util.List;

import org.mybatis.domain.Bom;

public interface BomDao {
	List<Bom> list(String wrCode);
	Bom switchBom(String wrChildCode);
}
