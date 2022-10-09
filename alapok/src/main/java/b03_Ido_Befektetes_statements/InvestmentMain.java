package b03_Ido_Befektetes_statements;

import java.util.Scanner;

public class InvestmentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Gépeld be a tőkét (integer):");
        int fund = scanner.nextInt();

        System.out.println("Gépeld be a kamatlábat (integer):");
        int interestRate = scanner.nextInt();

        System.out.println();
        System.out.println("Befektetés összege: "+fund);
        System.out.println("Kamatláb: "+interestRate);

        Investment investment=new Investment(fund,interestRate);

        System.out.println();
        System.out.println("Hány nap múlva érdekel a hozam (integer):");
        int days = scanner.nextInt();
        System.out.println("Hozam "+days+" napra: "+investment.getYield(days));

        System.out.println();
        System.out.println("Hány nap múlva zárjuk le (integer):");
        days = scanner.nextInt();
        System.out.println("Kivett összeg "+days+" nap után: "+investment.close(days));

        days += 10;
        System.out.println("Kivett összeg "+days+" nap után: "+investment.close(days));

    }
}
