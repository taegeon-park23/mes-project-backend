package org.mybatis.domain;

import java.io.Serializable;
import java.util.Date;

public class Im implements Serializable {
	private String imCode;
	private String mrCode;
	private String wrCode;
	private String bsnNumber;
	private int wrCount;
	private Date imDate;
	private boolean ref;
	private String lotNumber;
	
	public Im() { }

	public Im(String imCode, String mrCode, String wrCode, String bsnNumber, int wrCount, Date imDate, boolean ref,
			String lotNumber) {
		super();
		this.imCode = imCode;
		this.mrCode = mrCode;
		this.wrCode = wrCode;
		this.bsnNumber = bsnNumber;
		this.wrCount = wrCount;
		this.imDate = imDate;
		this.ref = ref;
		this.lotNumber = lotNumber;
	}

	public String getImCode() {
		return imCode;
	}

	public void setImCode(String imCode) {
		this.imCode = imCode;
	}

	public String getMrCode() {
		return mrCode;
	}

	public void setMrCode(String mrCode) {
		this.mrCode = mrCode;
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

	public Date getImDate() {
		return imDate;
	}

	public void setImDate(Date imDate) {
		this.imDate = imDate;
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
