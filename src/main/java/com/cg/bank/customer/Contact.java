package com.cg.bank.customer;

public class Contact {
	private String phoneNumber;
	private String mobileNumber;
	private String email;
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(final String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(final String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Contact(String phoneNumber, String mobileNumber, String email) {
		super();
		this.phoneNumber = phoneNumber;
		this.mobileNumber = mobileNumber;
		this.email = email;
	}
	public Contact() {
		// TODO Auto-generated constructor stub
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(final String email) {
		this.email = email;
	}
}
