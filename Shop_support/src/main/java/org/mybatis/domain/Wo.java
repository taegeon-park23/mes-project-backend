package org.mybatis.domain;

import java.util.Date;

public class Wo {
	private String woCode;
	private String wroCode;
	private String wrCode;
	private String wrpCode;
	private int wrCount;
	private int wrCountCur;
	private boolean woState;
	private Date woSdate; 
	private Date woEdate;
	private boolean ref;
	private String lotNumber;
	
	public Wo() {}

	public Wo(String woCode, String wroCode, String wrCode, String wrpCode, int wrCount, int wrCountCur,
			boolean woState, Date woSdate, Date woEdate, boolean ref, String lotNumber) {
		super();
		this.woCode = woCode;
		this.wroCode = wroCode;
		this.wrCode = wrCode;
		this.wrpCode = wrpCode;
		this.wrCount = wrCount;
		this.wrCountCur = wrCountCur;
		this.woState = woState;
		this.woSdate = woSdate;
		this.woEdate = woEdate;
		this.ref = ref;
		this.lotNumber = lotNumber;
	}

	public String getWoCode() {
		return woCode;
	}

	public void setWoCode(String woCode) {
		this.woCode = woCode;
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

	public int getWrCountCur() {
		return wrCountCur;
	}

	public void setWrCountCur(int wrCountCur) {
		this.wrCountCur = wrCountCur;
	}

	public boolean isWoState() {
		return woState;
	}

	public void setWoState(boolean woState) {
		this.woState = woState;
	}

	public Date getWoSdate() {
		return woSdate;
	}

	public void setWoSdate(Date woSdate) {
		this.woSdate = woSdate;
	}

	public Date getWoEdate() {
		return woEdate;
	}

	public void setWoEdate(Date woEdate) {
		this.woEdate = woEdate;
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
	}
	
	
	
}
