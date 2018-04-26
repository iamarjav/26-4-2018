import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.junit.Test;


import com.cg.bank.customer.Account;
import com.cg.bank.customer.Address;
import com.cg.bank.customer.Contact;
import com.cg.bank.customer.CustomerDetails;
import com.cg.bank.dao.BankDaoImpl;
import com.cg.bank.dao.IBankDao;
import com.cg.bank.service.BankServiceImpl;
import com.cg.bank.service.IBankService;

public class MyTest {

	@Test
	public void testBankApp() {
		IBankService iserv = new BankServiceImpl();
		Contact contact = new Contact("8054056356", "7499289944", "arjav.awasthi@gmail.com");
		Address address = new Address("MAll Road", "115", "208019", "Kanpur");
		Account acc = new Account("Savings", "Current");
		CustomerDetails customer = new CustomerDetails("101", "Savings", "Arjav", "Awasthi", 500.0, contact, address,
				0.0, acc);
		CustomerDetails customer2 = new CustomerDetails("102", "Current", "Rahul", "Mahajan", 500.0, contact, address,
				0.0, acc);

		BankDaoImpl bank = new BankDaoImpl();
		Map<String, CustomerDetails> map = bank.getMap();

		assertEquals(0, map.size());

		iserv.add(customer);
		iserv.add(customer2);

		System.out.println(map.size());

		assertEquals(2, map.size());//Test Case To Add

		iserv.transact(customer.getCustomer_id());//TestCase for view Customer
		assertEquals(0, 0);
		
		iserv.transact(customer2.getCustomer_id());//TestCase for view Customer
		assertEquals(0, 0);
		
		iserv.transaction(customer.getCustomer_id(), customer2.getCustomer_id(), 200);//TestCase For Transaction
		assertEquals(300, 300);
		
	}

}
