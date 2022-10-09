package a005_Termek_es_Bankszamla_classstructureintegrate;

public class BankAccount {
    String accountNumber;
    String owner;
    int balance;

    public BankAccount(String accountNumber, String owner, int balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }
    public void withdraw(int amount) {
        this.balance -= amount;
    }
    public String getInfo() {
        return owner+" ("+accountNumber+"): "+balance+" Ft";
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
