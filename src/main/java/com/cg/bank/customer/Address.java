package com.cg.bank.customer;

/**
 * @author arjawast
 * Address class which is being called used in CustomerDetails Class for Address entities
 */
public class Address {

	private String street;
	private String houseNumber;
	private String zipCode;
	private String city;
	public String getStreet() {
		return street;
	}
	public void setStreet(final String street) {
		this.street = street;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(final String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(final String zipCode) {
		this.zipCode = zipCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(final String city) {
		this.city = city;
	}
	public Address(final String street,final String houseNumber,final String zipCode,final String city) {
		super();
		this.street = street;
		this.houseNumber = houseNumber;
		this.zipCode = zipCode;
		this.city = city;
	}
	public Address() {
		// TODO Auto-generated constructor stub
	}
}
