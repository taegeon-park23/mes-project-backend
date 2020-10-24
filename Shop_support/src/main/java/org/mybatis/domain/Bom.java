package org.mybatis.domain;

import java.io.Serializable;

public class Bom implements Serializable{
	private String BomCode;
	private String wrParentCode;
	private String wrChildCode;
	private int bomCount;
	
	public Bom() {}

	public Bom(String bomCode, String wrParentCode, String wrChildCode, int bomCount) {
		super();
		BomCode = bomCode;
		this.wrParentCode = wrParentCode;
		this.wrChildCode = wrChildCode;
		this.bomCount = bomCount;
	}

	public String getBomCode() {
		return BomCode;
	}

	public void setBomCode(String bomCode) {
		BomCode = bomCode;
	}

	public String getWrParentCode() {
		return wrParentCode;
	}

	public void setWrParentCode(String wrParentCode) {
		this.wrParentCode = wrParentCode;
	}

	public String getWrChildCode() {
		return wrChildCode;
	}

	public void setWrChildCode(String wrChildCode) {
		this.wrChildCode = wrChildCode;
	}

	public int getBomCount() {
		return bomCount;
	}

	public void setBomCount(int bomCount) {
		this.bomCount = bomCount;
	};
	
}
