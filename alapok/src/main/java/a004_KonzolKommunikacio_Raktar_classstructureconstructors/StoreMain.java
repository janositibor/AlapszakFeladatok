package a004_KonzolKommunikacio_Raktar_classstructureconstructors;

import java.util.Scanner;

public class StoreMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type in the name of the 1st store:");
        String name=scanner.nextLine();

        System.out.println("Type in the product for the 1st store:");
        String product=scanner.nextLine();

        Store store1 = new Store(name,product);

        System.out.println("Type in the name of the 2nd store:");
        name=scanner.nextLine();

        System.out.println("Type in the product for the 2nd store:");
        product=scanner.nextLine();

        Store store2 = new Store(name,product);

        System.out.println(store1.report());
        System.out.println(store2.report());

        System.out.println();
        System.out.println("Type in the amount of arriving item into the 1st store:");
        int itemNumber = scanner.nextInt();
        store1.store(itemNumber);
        System.out.println(store1.report());
        System.out.println(store2.report());

        System.out.println();
        System.out.println("Type in the amount of arriving item into the 2nd store:");
        itemNumber = scanner.nextInt();
        store2.store(itemNumber);
        System.out.println(store1.report());
        System.out.println(store2.report());

        System.out.println();
        System.out.println("Type in the amount of dispatched item from the 1st store:");
        itemNumber = scanner.nextInt();
        store1.dispatch(itemNumber);
        System.out.println(store1.report());
        System.out.println(store2.report());

        System.out.println();
        System.out.println("Type in the amount of dispatched item from the 2nd store:");
        itemNumber = scanner.nextInt();
        store2.dispatch(itemNumber);
        System.out.println(store1.report());
        System.out.println(store2.report());
    }
}
