package c10_Konstansok_finalmodifier;

import java.util.Scanner;

public class TaxCalculator {
    public static final double VATvalue=0.27;
    public double tax(double price){
        return price*VATvalue/(1+VATvalue);
    }
    public double priceWithTax(double netPrice){
        return (1+VATvalue)*netPrice;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaxCalculator taxCalculator=new TaxCalculator();

        System.out.println("Type in the total price:");
        double bruttoPprice=scanner.nextDouble();
        System.out.println("It contains "+taxCalculator.tax(bruttoPprice)+" VAT");
        System.out.println();

        System.out.println("Type in the net. price:");
        double nettoPprice=scanner.nextDouble();
        System.out.println("The total price is? "+taxCalculator.priceWithTax(nettoPprice));
        System.out.println();

    }
}
