package org.mybatis.persistence;

import org.mybatis.domain.Ware;

public interface WareDao {

	String wrKind(String wrCode);

	Ware selectOne(String wrCode);

}
