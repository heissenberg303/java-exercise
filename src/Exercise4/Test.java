package Exercise4;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		Customer customer1 = new Customer("John", "Doe");
		Account account1 = new Savings(customer1, "Saving");
		account1.deposit(1000);
		account1.withdraw(500);
		//account1.withdraw(1000);
		//System.out.println(account1.getBalance());
		account1.display();
		 //Account accpunt3 = new Account(); Account Class is Abstract class -> Cannot use to create the object directly
		Customer customer2 = new Customer("Monica", "Galler");
		Account account2 = new Checking(customer2, "Checking");
		account2.deposit(500);
		account2.withdraw(600);
		account2.display();

		Customer customer3 = new Customer("Rachael", "Green");
		Account account3 = new Previleged(customer3, "Previleged", 1000);
		account3.deposit(50);
		account3.withdraw(550);
		account3.withdraw(1000);
		account3.display();
	}

}
