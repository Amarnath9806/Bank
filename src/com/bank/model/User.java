package com.bank.model;

import java.io.Serializable;

public class User implements Serializable {

	
private String firstname;
private String lastname;
private long adharCardNo;
private long accountNo;
private String accountType;
private String panCardNo;
private long phoneNo;
private String address;
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public long getAdharCardNo() {
	return adharCardNo;
}
public void setAdharCardNo(long adharCardNo) {
	this.adharCardNo = adharCardNo;
}
public long getAccountNo() {
	return accountNo;
}
public void setAccountNo(long accountNo) {
	this.accountNo = accountNo;
}
public String getAccountType() {
	return accountType;
}
public void setAccountType(String accountType) {
	this.accountType = accountType;
}
public String getPanCardNo() {
	return panCardNo;
}
public void setPanCardNo(String panCardNo) {
	this.panCardNo = panCardNo;
}
public long getPhoneNo() {
	return phoneNo;
}
public void setPhoneNo(long phoneNo) {
	this.phoneNo = phoneNo;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}


	}


