package com.cg.bank.service;

import java.util.Date;

import com.cg.bank.customer.CustomerDetails;

public interface IBankService {

	void add(CustomerDetails customer);

	int transact(String customer_id);

	int transaction(String user_id, String benificiary_id, double amount);

	int calcInterest(String user_id, String benificiary_id);

	public void statements(String user_id, String remarks, Date date);

	public void transctsumm(String customer_ide);
}
