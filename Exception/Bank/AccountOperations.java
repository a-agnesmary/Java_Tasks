package Exception.Bank;

interface AccountOperations {
    void deposit(double amount); 
    void withdraw(double amount) throws InsufficientBalanceException; 
    double getBalance(); 
}