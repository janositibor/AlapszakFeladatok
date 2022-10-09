package o12_lambdacomparator.account;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class BankAccounts {
    private List<BankAccount> accountsList;

    public BankAccounts(List<BankAccount> accountsList) {
        this.accountsList = accountsList;
    }

    public List<BankAccount> listBankAccountsByNameThenAccountNumber(){
        if(accountsList==null){
            throw new IllegalArgumentException("BankAccount mustn't be null!");
        }
        List<BankAccount> outputList=new ArrayList<>(accountsList);
        Collator collator = Collator.getInstance(new Locale("hu", "HU"));
        outputList.sort(Comparator.comparing(BankAccount::getNameOfOwner,Comparator.nullsFirst(collator)).thenComparing(Comparator.naturalOrder()));

        return outputList;
    }
    public List<BankAccount> listBankAccountsByAccountNumber(){
        if(accountsList==null){
            throw new IllegalArgumentException("BankAccount mustn't be null!");
        }
        List<BankAccount> outputList=new ArrayList<>(accountsList);
        outputList.sort(Comparator.naturalOrder());
        return outputList;
    }
    public List<BankAccount> listBankAccountsByBalance(){
        if(accountsList==null){
            throw new IllegalArgumentException("BankAccount mustn't be null!");
        }
        List<BankAccount> outputList=new ArrayList<>(accountsList);
        outputList.sort(Comparator.comparingDouble(BankAccount::getAbsBalance));
//        outputList.sort(Comparator.comparing(BankAccount::getAbsBalance));
        return outputList;
    }

    public List<BankAccount> listBankAccountsByBalanceDesc(){
        if(accountsList==null){
            throw new IllegalArgumentException("BankAccount mustn't be null!");
        }
        List<BankAccount> outputList=new ArrayList<>(accountsList);
        outputList.sort(Comparator.comparingDouble(BankAccount::getBalance).reversed());
        return outputList;
    }

    public List<BankAccount> getAccountsList() {
        return accountsList;
    }
}
