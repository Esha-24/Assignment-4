package bank;

import customer.Customer;

public class Bank {
	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.setName("Anwesha");
		c1.setUserName("anu12");
		c1.setPassword("123An123");
		c1.setAge(21);
		c1.setAddress("Kolkata");
		c1.setSSN("123456789");
		c1.setEmail("anu@gmail.com");
		c1.setPhone(9800123456L);
		c1.setBalance(10000);
		
		c1.login();
		
		
	}
}