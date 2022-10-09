package a005_Termek_es_Bankszamla_classstructureintegrate;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type in the name of the account's owner:");
        String name=scanner.nextLine();

        System.out.println("Type in the account number:");
        String accountNumber=scanner.nextLine();

        System.out.println("Type in the initial balance:");
        int balance=scanner.nextInt();

        BankAccount account = new BankAccount(accountNumber,name,balance);
        System.out.println(account.getInfo());

        System.out.println();
        System.out.println("Type in the amount of withdraw for "+account.getAccountNumber()+":");
        int amount = scanner.nextInt();
        account.withdraw(amount);
        System.out.println(account.getInfo());

        System.out.println();
        System.out.println("Type in the amount of deposit for "+account.getAccountNumber()+":");
        amount = scanner.nextInt();
        account.deposit(amount);
        System.out.println(account.getInfo());
    }
}
