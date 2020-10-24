package org.mybatis.domain;

import java.io.Serializable;

public class Bw implements Serializable{
	private String bwNumber;
	private String bwName;
	private String bsnNumber;
	private String wrCode;
	private int bwCount;
	
	public Bw() {}

	public Bw(String bwNumber, String bwName, String bsnNumber, String wrCode, int bwCount) {
		super();
		this.bwNumber = bwNumber;
		this.bwName = bwName;
		this.bsnNumber = bsnNumber;
		this.wrCode = wrCode;
		this.bwCount = bwCount;
	}

	public String getBwNumber() {
		return bwNumber;
	}

	public void setBwNumber(String bwNumber) {
		this.bwNumber = bwNumber;
	}

	public String getBwName() {
		return bwName;
	}

	public void setBwName(String bwName) {
		this.bwName = bwName;
	}

	public String getBsnNumber() {
		return bsnNumber;
	}

	public void setBsnNumber(String bsnNumber) {
		this.bsnNumber = bsnNumber;
	}

	public String getWrCode() {
		return wrCode;
	}

	public void setWrCode(String wrCode) {
		this.wrCode = wrCode;
	}

	public int getBwCount() {
		return bwCount;
	}

	public void setBwCount(int bwCount) {
		this.bwCount = bwCount;
	};
	
}
