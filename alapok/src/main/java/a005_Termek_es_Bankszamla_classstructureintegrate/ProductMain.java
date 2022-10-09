package a005_Termek_es_Bankszamla_classstructureintegrate;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type in the name of the product:");
        String name=scanner.nextLine();

        System.out.println("Type in the price of the product:");
        int price=scanner.nextInt();

        Product product = new Product(name,price);
        System.out.println(product.report());

        System.out.println();
        System.out.println("Type in the amount to increase the price of "+product.getName()+":");
        int amount = scanner.nextInt();
        product.increasePrice(amount);
        System.out.println(product.report());

        System.out.println();
        System.out.println("Type in the amount to decrease the price of "+product.getName()+":");
        amount = scanner.nextInt();
        product.decreasePrice(amount);
        System.out.println(product.report());
    }
}
