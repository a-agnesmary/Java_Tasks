package Exception.Bank;

class BankAccount implements AccountOperations {
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountHolderName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ". New balance: " + balance);
    }

    @Override
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient funds for withdrawal.");
        } 
        else {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". Remaining balance: " + balance);
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }

	public String getAccountHolderName() {
		return accountHolderName;
	}
}
