package org.mybatis.domain;

import java.io.Serializable;
import java.util.Date;

public class Wos implements Serializable{
	private String wosCode;
	private String woCode;
	private String wrCode;
	private String wrpCode;
	private int wrCount;
	private boolean wosState;
	private Date wosSdate;
	private Date wosEdate;
	private String lotNumber;
	
	public Wos() { }

	public Wos(String wosCode, String woCode, String wrCode, String wrpCode, int wrCount, boolean wosState,
			Date wosSdate, Date wosEdate, String lotNumber) {
		super();
		this.wosCode = wosCode;
		this.woCode = woCode;
		this.wrCode = wrCode;
		this.wrpCode = wrpCode;
		this.wrCount = wrCount;
		this.wosState = wosState;
		this.wosSdate = wosSdate;
		this.wosEdate = wosEdate;
		this.lotNumber = lotNumber;
	}

	public String getWosCode() {
		return wosCode;
	}

	public void setWosCode(String wosCode) {
		this.wosCode = wosCode;
	}

	public String getWoCode() {
		return woCode;
	}

	public void setWoCode(String woCode) {
		this.woCode = woCode;
	}

	public String getWrCode() {
		return wrCode;
	}

	public void setWrCode(String wrCode) {
		this.wrCode = wrCode;
	}

	public String getWrpCode() {
		return wrpCode;
	}

	public void setWrpCode(String wrpCode) {
		this.wrpCode = wrpCode;
	}

	public int getWrCount() {
		return wrCount;
	}

	public void setWrCount(int wrCount) {
		this.wrCount = wrCount;
	}

	public boolean isWosState() {
		return wosState;
	}

	public void setWosState(boolean wosState) {
		this.wosState = wosState;
	}

	public Date getWosSdate() {
		return wosSdate;
	}

	public void setWosSdate(Date wosSdate) {
		this.wosSdate = wosSdate;
	}

	public Date getWosEdate() {
		return wosEdate;
	}

	public void setWosEdate(Date wosEdate) {
		this.wosEdate = wosEdate;
	}

	public String getLotNumber() {
		return lotNumber;
	}

	public void setLotNumber(String lotNumber) {
		this.lotNumber = lotNumber;
	};
	
	
	
	
	
}
