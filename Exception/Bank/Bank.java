package Exception.Bank;

import java.util.ArrayList;
import java.util.List;

class Bank {
    private List<AccountOperations> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public AccountOperations getAccount(int index) {
        return accounts.get(index);
    }
}
