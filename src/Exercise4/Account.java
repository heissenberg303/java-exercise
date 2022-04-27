package Exercise4;

public abstract class Account {
	String accountType;
	static double balance;
	Customer customer;
	
	public Account(Customer customer, String accountType) {
		super();
		this.customer = customer;
		this.accountType = accountType;	
	}

		
	public double getBalance() {
		return balance;
	}

	public static void setBalance(double balance) {
		Account.balance = balance;
	}


	public void deposite(double amount) {
		balance += amount;
		System.out.println("Deposite... " + balance);
		System.out.println("SUCCESSFUL TRANSACTION");
	}
	
	public void withdraw(double amount) {
		double remaining = balance - amount;
		System.out.println("Please wait while withdrawing amount: "+ amount);
		if (remaining < 0) {
			System.out.println("TRANSACTION DENIED. Insufficient funds");
		}
		else {
			balance -= amount;
			System.out.println("SUCCESSFUL TRANSACTION");
		}
	}
	
	public void display() {
		System.out.format("Name: %s %s \n" +
				"Account type: %s\n" +
				"Balance: %f\n", customer.getFirstName(), customer.getLastName(), accountType, balance);
		System.out.println();
		
	}
	
	
}
