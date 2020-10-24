package org.mybatis.domain;

import java.io.Serializable;

public class Workplace implements Serializable{
	private String wkCode;
	private String wkName;
	private String wkLocation;
	
	public Workplace() {}

	public Workplace(String wkCode, String wkName, String wkLocation) {
		super();
		this.wkCode = wkCode;
		this.wkName = wkName;
		this.wkLocation = wkLocation;
	}

	public String getWkCode() {
		return wkCode;
	}

	public void setWkCode(String wkCode) {
		this.wkCode = wkCode;
	}

	public String getWkName() {
		return wkName;
	}

	public void setWkName(String wkName) {
		this.wkName = wkName;
	}

	public String getWkLocation() {
		return wkLocation;
	}

	public void setWkLocation(String wkLocation) {
		this.wkLocation = wkLocation;
	};
	
}
