package org.mybatis.domain;

import java.io.Serializable;
import java.util.Date;

public class Wro implements Serializable{
	private String wroCode;
	private String wrCode;
	private int wrCount;
	private Date wroDate;
	private boolean ref;
	private String lotNumber;
	
	public Wro() {}

	public Wro(String wroCode, String wrCode, int wrCount, Date wroDate, boolean ref, String lotNumber) {
		super();
		this.wroCode = wroCode;
		this.wrCode = wrCode;
		this.wrCount = wrCount;
		this.wroDate = wroDate;
		this.ref = ref;
		this.lotNumber = lotNumber;
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

	public int getWrCount() {
		return wrCount;
	}

	public void setWrCount(int wrCount) {
		this.wrCount = wrCount;
	}

	public Date getWroDate() {
		return wroDate;
	}

	public void setWroDate(Date wroDate) {
		this.wroDate = wroDate;
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
