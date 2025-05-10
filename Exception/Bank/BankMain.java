package Exception.Bank;

public class BankMain {
    public static void main(String[] args) {
        Bank bank = new Bank();
       
        BankAccount account1 = new BankAccount("Agnes", 1000);
        
        bank.addAccount(account1);

        try {
            account1.deposit(500);
            account1.withdraw(2000); 
        } 
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}

