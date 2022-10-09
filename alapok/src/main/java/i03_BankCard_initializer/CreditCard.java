package i03_BankCard_initializer;

import java.util.Arrays;
import java.util.List;

public class CreditCard {
    private static final List<Rate> RATES_LIST;
    private long balance;

    static{
        final Rate[] rates = {new Rate(Currency.HUF, 1.0),
                new Rate(Currency.EUR, 308.23),
                new Rate(Currency.SFR, 289.24),
                new Rate(Currency.GBP, 362.23),
                new Rate(Currency.USD, 289.77)};
        RATES_LIST= Arrays.asList(rates);
    }

    public CreditCard(long balance, Currency currency){
        double conversionFactor=getConversionFactorToCurrency(currency);
        this.balance= (long)(balance*conversionFactor);
    }

    private double getConversionFactorToCurrency(Currency currency){
        for(Rate rate:RATES_LIST){
            if(rate.getCurrency()==currency){
                return rate.getConversionFactor();
            }
        }
        throw new IllegalArgumentException("Currency problem!");
    }

    public CreditCard(long balance){
        this(balance, Currency.HUF);
    }


    public boolean payment(long amount, Currency currency){
        double conversionFactor=getConversionFactorToCurrency(currency);
        long amountInHUF=(long)(amount*conversionFactor);

        if(balance>amountInHUF){
            balance-=amountInHUF;
            return true;
        }
        return false;
    }

    public boolean payment(long amount){
        return payment(amount, Currency.HUF);
    }

    public long getBalance() {
        return balance;
    }
}
