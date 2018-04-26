package com.cg.bank.customer;

import org.springframework.stereotype.Component;

/**
 * @author arjawast
 * Customer Details -This being the main class has all attributes required for Bank Customer relationship
 */

@Component
public class CustomerDetails {

	private String customer_id;
	private String account_type;
	private String firstname;
	private String surname;
	private double initial_Amount;
	private Contact contact;
	private Address address;
	private double intst = 0;
	private Account account;

	public Contact getContact() {
		return contact;
	}

	public void setContact(final Contact contact) {
		this.contact = contact;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public String getAccount_type() {
		return account_type;
	}

	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public double getInitial_Amount() {
		return initial_Amount;
	}

	public void setInitial_Amount(double initial_Amount) {
		this.initial_Amount = initial_Amount;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public CustomerDetails() {
		// TODO Auto-generated constructor stub
	}

	public double getIntst() {
		return intst;
	}

	public void setIntst(double intst) {
		this.intst = intst;
	}

	public CustomerDetails(String customer_id, String account_type, String firstname, String surname,
			double initial_Amount, Contact contact, Address address, double intst, Account account) {
		super();
		this.customer_id = customer_id;
		this.account_type = account_type;
		this.firstname = firstname;
		this.surname = surname;
		this.initial_Amount = initial_Amount;
		this.contact = contact;
		this.address = address;
		this.intst = intst;
		this.account = account;
	}

	
}
