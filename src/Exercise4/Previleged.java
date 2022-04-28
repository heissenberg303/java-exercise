package Exercise4;

public class Previleged extends Account{
    double overDraftLimit;

    public Previleged(Customer customer, String accountType, double overDraftLimit) {
        super(customer, accountType);
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        overDraftLimit += amount;
    }

    @Override
    public void withdraw(double amount) {
        //super.withdraw(amount);
        double privilegeBalance = getBalance();
        System.out.println("Please wait while withdrawing amount: " + amount);
        if (amount > privilegeBalance) {
            System.out.println("Amount requested is beyond limit... checking overdraft limit.");
            if (amount > overDraftLimit) {
                System.out.println("TRANSACTION DENIED. Overdraft limit exceed");
                System.out.println();
                return;
            }
            else {
                privilegeBalance -= amount;
                overDraftLimit -= amount;
                setBalance(privilegeBalance);
                System.out.println("SUCCESSFUL TRANSACTION");
                System.out.println();
            }
        }
    }

    @Override
    public void display() {
        //super.display();
        System.out.format("Customer Account Name: %s %s \n" +
                "%s Account Balance: %.2f\n" +
                "Overdraft Available Limit: %.2f\n", customer.getFirstName(), customer.getLastName(), accountType, getBalance(), overDraftLimit);
        System.out.println();

    }
}
