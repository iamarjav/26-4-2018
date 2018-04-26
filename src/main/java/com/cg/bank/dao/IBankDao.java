package com.cg.bank.dao;

import java.util.Date;

import com.cg.bank.customer.CustomerDetails;
import com.cg.bank.customer.Statement;

public interface IBankDao {

	void add(CustomerDetails customer);

	int transact(String customer_id);

	int transaction(String user_id, String benificiary_id, double amount);

	int calcInterest(String user_id, String benificiary_id);

	public void statements(String user_id, String remarks, Date date);
	
	public void addStatement(Statement statement);
	
	public void transctsumm(String customer_ide);
}
