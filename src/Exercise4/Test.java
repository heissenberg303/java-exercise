package Exercise4;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		Customer customer1 = new Customer("Ross", "Galler");
		Account account1 = new Savings(customer1, "Saving");
		account1.deposite(1000);
		account1.withdraw(500);
		//account1.withdraw(1000);
		//System.out.println(account1.getBalance());
		account1.display();
		
		Customer customer2 = new Customer("Monica", "Galler");
		Account account2 = new Checking(customer2, "Checking");
		account2.deposite(500);
		account2.withdraw(600);
		account2.display();
	}

}
