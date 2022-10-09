package h09_StatisztikaStaticAttributummal_staticattrmeth;

public class BankTransaction {
    private static final long MIN_TRANSACTION_VALUE=1;
    private static final long MAX_TRANSACTION_VALUE=10000000;
    private static long countOfTransactions;
    private static long sumOfTransactions;
    private static long currentMinValue;
    private static long currentMaxValue;

    private long transactionValue;

    public BankTransaction(long transactionValue){
        if(transactionValue<MIN_TRANSACTION_VALUE || MAX_TRANSACTION_VALUE<transactionValue){
            throw new IllegalArgumentException("The amount for transaction should be between 1 and 10 000 000!");
        }
        this.transactionValue=transactionValue;
        setStatForTrancations(transactionValue);
    }

    private void setStatForTrancations(long transactionValue) {
        countOfTransactions++;
        sumOfTransactions+=transactionValue;
        currentMinValue=transactionValue<currentMinValue?transactionValue:currentMinValue;
        currentMinValue=transactionValue>currentMinValue?transactionValue:currentMinValue;
    }

    public static void initTheDay(){
        countOfTransactions=0;
        sumOfTransactions=0;
        currentMinValue=Long.MAX_VALUE;
        currentMaxValue=0;
    }
    public static long getAverageOfTransaction(){
        return countOfTransactions==0?0:sumOfTransactions/countOfTransactions;
    }
    public static long getCurrentMinValue(){
        return countOfTransactions==0?0:currentMinValue;
    }
    public static long getCurrentMaxValue(){
        return currentMaxValue;
    }
    public static long getSumOfTransactions(){
        return sumOfTransactions;
    }

    public long getTransactionValue(){
        return transactionValue;
    }
}
