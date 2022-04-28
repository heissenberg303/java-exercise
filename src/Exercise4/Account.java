package Exercise4;

public abstract class Account {
	String accountType;
	private double balance; // static variable belong to the class not the object of the class
	Customer customer;
	
	public Account(Customer customer, String accountType) {
		super();
		this.customer = customer;
		this.accountType = accountType;	
	}

		
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}


	public void deposit(double amount) {
		System.out.println("Deposit... " + amount);
		balance += amount;
		System.out.println("SUCCESSFUL TRANSACTION");
		System.out.println();
	}
	
	public void withdraw(double amount) {
		double remaining = balance - amount;
		System.out.println("Please wait while withdrawing amount: "+ amount);
		if (remaining < 0) {
			System.out.println("TRANSACTION DENIED. Insufficient funds");
			System.out.println();
		}
		else {
			balance -= amount;
			System.out.println("SUCCESSFUL TRANSACTION");
			System.out.println();
		}
	}
	
	public void display() {
		System.out.format("Customer Account Name: %s %s \n" +
				"%s Account Balance: %.2f\n" , customer.getFirstName(), customer.getLastName(), accountType, balance);
		System.out.println();
		
	}
	
	
}
