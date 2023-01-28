package customer;

import java.util.Scanner;

import validation.Validation;

public class Customer implements Validation{
	private String  name;
	private String userName;
	private String password;
	private int age;
	private String SSN;
	private String address;
	private String email;
	private long phone;
	private float balance;
	Scanner sc = new Scanner(System.in);
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	
	public void login() {
		
		System.out.println("\n*****************Welcome To ABC Bank Limited*************");
		System.out.println("Enter username : ");
		String uName = sc.next();
		System.out.println("Enter password : ");
		String passW = sc.next();
		
		if(uName.equals(this.getUserName()) && passW.equals(this.getPassword()))
			showOptions();
		else
			System.out.println("Wrong credentials!!!Please try again.");
			login();
		
	}
	private void showOptions() {
		// TODO Auto-generated method stub
		System.out.println("\n_________Please select the options__________\n\n1.Deposit\n2.Withdrawl\n3.Check balance\n4Edit profile\n5.Change password\n6.Exit\n7.ValidateSSN\n8.ValidateAge\n");
		System.out.println("Enter your choice : ");
		int choice = sc.nextInt();
		switch(choice) {
		case 1 :
			deposit();
			break;
		case 2 :
			withdrawl();
			break;
		case 3 :
			checkBalance();
			break;
		case 4 :
			editProfile();
			break;
		case 5 :
			changePassword();
			break;
		case 6 :
			this.login();
			break;
		case 7 :
			this.validateSSN();
			break;
		case 8 :
			this.validateAge();
			break;
		default :
			System.out.println("You entered wrong choice...please try again.");
			login();
		}
	}
	private void wantToContinue() {
		System.out.println("\nDo you want to continue ?  Enter 'YES' to continue  Enter 'NO' to exit.");
		System.out.println("\nEnter your choice : ");
		String ch = sc.next();
		if(ch.equalsIgnoreCase("YES"))
			this.showOptions();
		else
			this.login();
		
	}
	private void deposit() {
		System.out.println("\nEnter ammount to be depositted : ");
		float amt = sc.nextFloat();
		this.balance += amt;
		System.out.println(amt+" depositted successfully.");
		wantToContinue();
		
	}
	private void withdrawl() {
		System.out.println("\nEnter ammount to be withdraw : ");
		float amt = sc.nextFloat();
		if(this.balance+1000>amt) {
			this.balance -= amt;
			System.out.println(amt+" withdrawn successfully.");
		}
		else {
			System.out.println("\nYou don't have sufficient balance to perform the transaction.");
		}
		wantToContinue();
	}
	private void checkBalance() {
		System.out.println("\nYour total balance is : "+this.getBalance());
		wantToContinue();
	}
	private void editProfile() {
		System.out.println("Enter your new name : ");
		String name = sc.next();
		this.setName(name);
		System.out.println("Enter your new email : ");
		String email = sc.next();
		this.setEmail(email);
		System.out.println("\nYour profile updated successfully.");
		wantToContinue();
	}
	private void changePassword() {
		System.out.println("Enter your new phone number first to confirm your identity : ");
		long ph = sc.nextLong();
		if(ph==this.getPhone()) {
			System.out.println("Enter your new password : ");
			String pass = sc.next();
			this.setPassword(pass);
			System.out.println("\nYour password updated successfully.");
		}
		else
		{
			System.out.println("\nSorry!!!try again later...");
		}
		wantToContinue();
	}
	@Override
	public void validateSSN() {
		// TODO Auto-generated method stub
		if(this.getSSN().length()==9)
		{
			System.out.println("Your SSN is valid.");
		}
		else
		{
			System.out.println("Your SSN is not valid.");
		}
		wantToContinue();
	}
	@Override
	public void validateAge() {
		// TODO Auto-generated method stub
		if(this.getAge()>18)
		{
			System.out.println("Your age is "+this.getAge()+" which is valid to open an account.");
		}
		else
		{
			System.out.println("Your age is  "+this.getAge()+" which is not valid to open an account.");
		}
		wantToContinue();
	}

}