package org.mybatis.domain;

import java.io.Serializable;

public class Wrp implements Serializable{
	private String wrpCode;
	private String wrpName;
	private String wkCode;
	private String wrCode;
	
	public Wrp() {}

	public Wrp(String wrpCode, String wrpName, String wkCode, String wrCode) {
		super();
		this.wrpCode = wrpCode;
		this.wrpName = wrpName;
		this.wkCode = wkCode;
		this.wrCode = wrCode;
	}

	public String getWrpCode() {
		return wrpCode;
	}

	public void setWrpCode(String wrpCode) {
		this.wrpCode = wrpCode;
	}

	public String getWrpName() {
		return wrpName;
	}

	public void setWrpName(String wrpName) {
		this.wrpName = wrpName;
	}

	public String getWkCode() {
		return wkCode;
	}

	public void setWkCode(String wkCode) {
		this.wkCode = wkCode;
	}

	public String getWrCode() {
		return wrCode;
	}

	public void setWrCode(String wrCode) {
		this.wrCode = wrCode;
	};
	
}
