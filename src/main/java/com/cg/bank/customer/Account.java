package com.cg.bank.customer;

public class Account {

	private String savingsAccount;
	
	private String currentAccount;

	public String getSavingsAccount() {
		return savingsAccount;
	}

	public void setSavingsAccount(String savingsAccount) {
		this.savingsAccount = savingsAccount;
	}

	public String getCurrentAccount() {
		return currentAccount;
	}

	public void setCurrentAccount(String currentAccount) {
		this.currentAccount = currentAccount;
	}

	public Account(String savingsAccount, String currentAccount) {
		super();
		this.savingsAccount = savingsAccount;
		this.currentAccount = currentAccount;
	}

	public Account() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Account [savingsAccount=" + savingsAccount + ", currentAccount=" + currentAccount + "]";
	}
}
