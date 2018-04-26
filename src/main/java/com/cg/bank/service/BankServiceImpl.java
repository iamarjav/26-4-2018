package com.cg.bank.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bank.customer.CustomerDetails;
import com.cg.bank.customer.Statement;
import com.cg.bank.dao.BankDaoImpl;
import com.cg.bank.dao.IBankDao;

@Service("bankServiceImpl")
public class BankServiceImpl implements IBankService {

	
	IBankDao idao=new BankDaoImpl() ;

	@Override
	public void add(CustomerDetails customer) {

		idao.add(customer);

	}

	public BankServiceImpl(IBankDao idao) {
		super();
		this.idao = idao;
	}

	public BankServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int transact(String customer_id) {
		// TODO Auto-generated method stub
		return idao.transact(customer_id);
	}

	@Override
	public int transaction(String user_id, String benificiary_id, double amount) {
		// TODO Auto-generated method stub
		return idao.transaction(user_id, benificiary_id, amount);
	}

	@Override
	public int calcInterest(String user_id, String benificiary_id) {
		// TODO Auto-generated method stub
		return idao.calcInterest(user_id, benificiary_id);
	}

	@Override
	public void statements(String user_id, String remarks, Date date) {
		// TODO Auto-generated method stub
		idao.statements(user_id, remarks, date);
	}

	public void addStatement(Statement statement) {
		// TODO Auto-generated method stub
		idao.addStatement(statement);
	}

	public void transctsumm(String customer_ide) {
		// TODO Auto-generated method stub
		idao.transctsumm(customer_ide);
	}

}
