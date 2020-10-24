package org.mybatis.domain;

import java.io.Serializable;

public class Ware implements Serializable{
	private String wrCode;
	private String wrName;
	private String wrKind;
	private String bsnNumber;
	
	public Ware() {}

	public Ware(String wrCode, String wrName, String wrKind, String bsnNumber) {
		super();
		this.wrCode = wrCode;
		this.wrName = wrName;
		this.wrKind = wrKind;
		this.bsnNumber = bsnNumber;
	}

	public String getWrCode() {
		return wrCode;
	}

	public void setWrCode(String wrCode) {
		this.wrCode = wrCode;
	}

	public String getWrName() {
		return wrName;
	}

	public void setWrName(String wrName) {
		this.wrName = wrName;
	}

	public String getWrKind() {
		return wrKind;
	}

	public void setWrKind(String wrKind) {
		this.wrKind = wrKind;
	}

	public String getBsnNumber() {
		return bsnNumber;
	}

	public void setBsnNumber(String bsnNumber) {
		this.bsnNumber = bsnNumber;
	};
	
}
