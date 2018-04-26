package com.cg.bank.dao;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.cg.bank.customer.CustomerDetails;
import com.cg.bank.customer.Statement;

@Repository
public class BankDaoImpl implements IBankDao {

	
	
	static Map<String, CustomerDetails> map = new HashMap<>();
	
	
	static Map<String, Statement> map2 = new HashMap<>();
	public Map<String, CustomerDetails> getMap() {
		return map;
	}

	@Override
	public void add(CustomerDetails customer) {

		map.put(customer.getCustomer_id(),customer);
		

	}

	@Override
	public int transact(String customer_id) {
		// TODO Auto-generated method stub
		
		
	if(map.containsKey(customer_id))
	{
		
		CustomerDetails details=map.get(customer_id);
		//System.out.println("Your Account Type:"+details.getAccount().toString());
		System.out.println("First Name:"+details.getFirstname());
		System.out.println("Last Name:"+details.getSurname());
		System.out.println("Current Balance:"+details.getInitial_Amount());
		System.out.println("Interest:"+details.getIntst());
		
	}
	
	else {
		
		System.out.println("No User Found");
	}
	return 0;

}

	@Override
	public int transaction(String user_id, String benificiary_id, double amount) {
		if(map.containsKey(user_id)&& map.containsKey(benificiary_id))
		{
			CustomerDetails c1=map.get(user_id);
			CustomerDetails c2=map.get(benificiary_id);
			double updated_user_amount=c1.getInitial_Amount()-amount;
			c1.setInitial_Amount(updated_user_amount);
			double updated_benificiary_amount=c2.getInitial_Amount()+amount;
			c2.setInitial_Amount(updated_benificiary_amount);
			map.put(user_id, c1);
			System.out.println("Success");
			
		}
		
		else {
			
			System.out.println("Transaction Failed");
		}
		return 0;
	}

	@Override
	public int calcInterest(String user_id, String benificiary_id) {
		if(map.containsKey(user_id)&&map.containsKey(benificiary_id))
		{
			CustomerDetails c1=map.get(user_id);
			CustomerDetails c2=map.get(benificiary_id);
			double interest=(c1.getInitial_Amount()*9*1)/100;
			double interes=(c2.getInitial_Amount()*9*1)/100;
			c1.setIntst(interest);
			c2.setIntst(interes);
		}
		return 0;
	}

	@Override
	public void statements(String user_id, String remarks, Date date) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addStatement(Statement statement) {
		
		map2.put(statement.getC(), statement);
	}

	@Override
	public void transctsumm(String customer_ide) {
		if(map2.containsKey(customer_ide))
		{
			
			Statement details=map2.get(customer_ide);
			System.out.println("Your Transaction Summary:"+details.getRemark());
			System.out.println("Date:"+details.getDate());
			System.out.println("UserId:"+details.getC());
			
			
		}
		
		else {
			
			System.out.println("No User Found");
		}
		
		
	}}
