package com.cg.bank.controller;

import java.util.Date;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.cg.bank.customer.Account;
import com.cg.bank.customer.Address;
import com.cg.bank.customer.Contact;
import com.cg.bank.customer.CustomerDetails;
import com.cg.bank.customer.Statement;
import com.cg.bank.service.BankServiceImpl;

public class Controller {

	public static Scanner sc = new Scanner(System.in);

	public static void main(final String args[]) {

		final ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		final BankServiceImpl iserv = applicationContext.getBean("bankService", BankServiceImpl.class);

		System.out.println("Capgemini India Global Bank");
		System.out.println("-------------------------");

		while (true) {
			System.out.println("1-Add User");
			System.out.println("2-Find User");
			System.out.println("3-Transactions");
			System.out.println("4-Transaction Summary");
			System.out.println("5-Exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				final Address address = new Address();
				final Contact contact = new Contact();
				String id;
				String frsname;
				String surname;
				String account="demo";
				double balance;
				System.out.println("Welcome!Happy To Help You");
				System.out.println("-------------------------------------------------------");
				System.out.println("Hi.Please Enter Customer Id");
				id = sc.next();
				// customer.setCustomer_id(id);
				System.out.println("Please Enter Your First Name");
				frsname = sc.next();
				// customer.setFirstname(frsname);
				System.out.println("Please Enter Your Sur Name");
				surname = sc.next();
				// customer.setSurname(surname);
				System.out.println("Please Select Account");
				System.out.println("1-SavingsAccount");
				System.out.println("2-CurrentAccount");
				Account acc=new Account();
				int accountchoice = sc.nextInt();
				switch(accountchoice)
				{
				case 1:
					acc.setSavingsAccount("savingsAccount");
					
					break;
				case 2:
					acc.setCurrentAccount("currentAccount");
				}
				// customer.setAccount_type(account);
				System.out.println("Please Enter Your Initial Balance");
				balance = sc.nextDouble();
				// customer.setInitial_Amount(balance);
				System.out.println("Please Enter Your Mobile Number");
				String mobilenumber = sc.next();
				contact.setMobileNumber(mobilenumber);
				System.out.println("Please Enter Your Phone Number");
				String phonenumber = sc.next();
				contact.setMobileNumber(phonenumber);
				System.out.println("Please Enter The Email");
				String email = sc.next();
				contact.setEmail(email);
				System.out.println("Thank You!");
				System.out.println("---------------------------------------");
				System.out.println("Please Enter Your Street");
				final String street = sc.next();

				address.setStreet(street);
				System.out.println("Please Enter Your House Number");
				String housenumber = sc.next();
				address.setHouseNumber(housenumber);
				System.out.println("Please Enter Your Zipcode");
				String zipcode = sc.next();
				address.setZipCode(zipcode);
				System.out.println("Please Enter Your City");
				final String city = sc.next();
				address.setCity(city);
				CustomerDetails customer = new CustomerDetails(id, account, frsname, surname, balance, contact, address,
						0.0,acc);
				customer.setAccount(acc);
				iserv.add(customer);
				break;
			case 2:
				System.out.println("Enter Customer Id");
				String customer_id = sc.next();
				iserv.transact(customer_id);
				break;
			case 3:

				final Date date = new Date();
				System.out.println("Enter Payee Id");
				final String user_id = sc.next();

				System.out.println("Enter Benificiary Id");
				String benificiary_id = sc.next();
				System.out.println("Enter Amount");
				double amount = sc.nextDouble();
				System.out.println("Enter Remarks");
				final String remarks = sc.next();
				/*
				 * statement.setDate(date); statement.setRemark(remarks);
				 */
				Statement statement = new Statement(remarks, date, user_id);
				iserv.addStatement(statement);

				iserv.transaction(user_id, benificiary_id, amount);
				iserv.calcInterest(user_id, benificiary_id);

				break;
			case 4:
				System.out.println("Enter Customer Id");
				final String customer_ide = sc.next();
				iserv.transctsumm(customer_ide);
				break;
			case 5:
				System.exit(0);
				break;
			}
		}

	}

}
