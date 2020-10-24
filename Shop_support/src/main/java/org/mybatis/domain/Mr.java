package org.mybatis.domain;

import java.io.Serializable;
import java.util.Date;


public class Mr implements Serializable{
	private String mrCode;
	private String wroCode;
	private String wrCode;
	private String bsnNumber;
	private int wrCount;
	private int wrCountCur;
	private Date mrDate;
	private boolean ref;
	private String lotNumber;
	
	public Mr() {}

	public Mr(String mrCode, String wroCode, String wrCode, String bsnNumber, int wrCount, int wrCountCur, Date mrDate, boolean ref,
			String lotNumber) {
		super();
		this.mrCode = mrCode;
		this.wroCode = wroCode;
		this.wrCode = wrCode;
		this.wrCountCur = wrCountCur;
		this.bsnNumber = bsnNumber;
		this.wrCount = wrCount;
		this.mrDate = mrDate;
		this.ref = ref;
		this.lotNumber = lotNumber;
	}

	public String getMrCode() {
		return mrCode;
	}

	public void setMrCode(String mrCode) {
		this.mrCode = mrCode;
	}

	public String getWroCode() {
		return wroCode;
	}

	public void setWroCode(String wroCode) {
		this.wroCode = wroCode;
	}

	public String getWrCode() {
		return wrCode;
	}

	public void setWrCode(String wrCode) {
		this.wrCode = wrCode;
	}
	

	public String getBsnNumber() {
		return bsnNumber;
	}

	public void setBsnNumber(String bsnNumber) {
		this.bsnNumber = bsnNumber;
	}

	public int getWrCount() {
		return wrCount;
	}

	public void setWrCount(int wrCount) {
		this.wrCount = wrCount;
	}

	public int getWrCountCur() {
		return wrCountCur;
	}
	
	public void setWrCountCur(int wrCountCur) {
		this.wrCountCur = wrCountCur;
	}
	
	public Date getMrDate() {
		return mrDate;
	}

	public void setMrDate(Date mrDate) {
		this.mrDate = mrDate;
	}

	public boolean isRef() {
		return ref;
	}

	public void setRef(boolean ref) {
		this.ref = ref;
	}

	public String getLotNumber() {
		return lotNumber;
	}

	public void setLotNumber(String lotNumber) {
		this.lotNumber = lotNumber;
	};
	
}
