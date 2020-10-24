package org.mybatis.domain;

import java.io.Serializable;

public class Warehouse implements Serializable{
	private String wrhCode;
	private String wrhLocation;
	private String wrhKind;
	private String wrCode;
	private int wrhCount;
	
	public Warehouse() {}

	public Warehouse(String wrhCode, String wrhLocation, String wrhKind, String wrCode, int wrhCount) {
		super();
		this.wrhCode = wrhCode;
		this.wrhLocation = wrhLocation;
		this.wrhKind = wrhKind;
		this.wrCode = wrCode;
		this.wrhCount = wrhCount;
	}

	public String getWrhCode() {
		return wrhCode;
	}

	public void setWrhCode(String wrhCode) {
		this.wrhCode = wrhCode;
	}

	public String getWrhLocation() {
		return wrhLocation;
	}

	public void setWrhLocation(String wrhLocation) {
		this.wrhLocation = wrhLocation;
	}

	public String getWrhKind() {
		return wrhKind;
	}

	public void setWrhKind(String wrhKind) {
		this.wrhKind = wrhKind;
	}

	public String getWrCode() {
		return wrCode;
	}

	public void setWrCode(String wrCode) {
		this.wrCode = wrCode;
	}

	public int getWrhCount() {
		return wrhCount;
	}

	public void setWrhCount(int wrhCount) {
		this.wrhCount = wrhCount;
	};
	
}
