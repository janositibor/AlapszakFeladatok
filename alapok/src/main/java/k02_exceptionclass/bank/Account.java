package k02_exceptionclass.bank;

public class Account {
    String accountNumber;
    double balance;
    double maxSubtract;

    public Account(String accountNumber, double balance) {
        if(accountNumber==null || accountNumber.isEmpty()){
            throw new IllegalArgumentException("Account number should not be null!");
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.maxSubtract = 100000;
    }

    public double deposit(double amount) {
        validateAmount(amount);
        this.balance += amount;
        return balance;
    }
    public double subtract(double amount) {
        validateAmount(amount);
        if(amount>maxSubtract){
            throw new InvalidAmountBankOperationException("The limit for max subtract has exceed!");
        }
        if(amount>balance){
            throw new LowBalanceBankOperationException("Low balance!");
        }
        this.balance -= amount;
        return balance;
    }

    private void validateAmount(double amount) {
        if(amount<0){
            throw new InvalidAmountBankOperationException("Invalid amount!");
        }
    }

    public void setMaxSubtract(double maxSubtract) {
        validateAmount(maxSubtract);
        this.maxSubtract = maxSubtract;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getMaxSubtract() {
        return maxSubtract;
    }
}
