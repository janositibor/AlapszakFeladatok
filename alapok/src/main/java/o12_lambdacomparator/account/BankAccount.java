package o12_lambdacomparator.account;

public class BankAccount implements Comparable<BankAccount>{
    private String accountNumber;
    private String nameOfOwner;
    private double balance;

    public BankAccount(String accountNumber, String nameOfOwner, double balance) {
        this.accountNumber = accountNumber;
        this.nameOfOwner = nameOfOwner;
        this.balance = balance;
    }

    @Override
    public int compareTo(BankAccount o) {
        return this.getAccountNumber().compareTo(o.getAccountNumber());
    }

    public double getAbsBalance() {
        return Math.abs(balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public double getBalance() {
        return balance;
    }

}
