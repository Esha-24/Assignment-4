package account;

public class Savings extends Account{
	
	public void display() {
		System.out.println("Account no. : "+this.getAccountId());
		System.out.println("Account description : "+this.getDescription());
		System.out.println("MinimumBalance : "+this.getMinimumBalance());
		
	}

}