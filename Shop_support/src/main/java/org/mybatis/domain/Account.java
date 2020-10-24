package org.mybatis.domain;

import java.io.Serializable;

public class Account implements Serializable{
	private String bsnNumber;
	private String bsnName;
	
	public Account() { }
	public Account(String bsnNumber, String bsnName) {
		super();
		this.bsnNumber = bsnNumber;
		this.bsnName = bsnName;
	}
	public String getBsnNumber() {
		return bsnNumber;
	}
	public void setBsnNumber(String bsnNumber) {
		this.bsnNumber = bsnNumber;
	}
	public String getBsnName() {
		return bsnName;
	}
	public void setBsnName(String bsnName) {
		this.bsnName = bsnName;
	}
	
	
}
