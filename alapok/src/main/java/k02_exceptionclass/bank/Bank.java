package k02_exceptionclass.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accountsList=new ArrayList<>();

    public Bank(List<Account> accountsList) {
        if(accountsList==null){
            throw new IllegalArgumentException("Account list should not be null!");
        }
        this.accountsList = accountsList;
    }

    private Account gecAccountFromAccountNumber(String accountNumber){
        for(Account account: accountsList){
            if(accountNumber.equals(account.getAccountNumber())){
                return account;
            }
        }
        throw new InvalidAccountNumberBankOperationException("Invalid account number!");
    }

    public void payment(String accountNumber, double amount) {
        Account account=gecAccountFromAccountNumber(accountNumber);
        account.subtract(amount);
    }
    public void deposit(String accountNumber, double amount) {
        Account account=gecAccountFromAccountNumber(accountNumber);
        account.deposit(amount);
    }

    public List<Account> getAccountsList() {
        return accountsList;
    }
}
