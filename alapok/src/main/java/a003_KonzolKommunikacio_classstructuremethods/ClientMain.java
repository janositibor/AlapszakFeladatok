package a003_KonzolKommunikacio_classstructuremethods;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        a003_KonzolKommunikacio_classstructuremethods.Client client = new a003_KonzolKommunikacio_classstructuremethods.Client();

        System.out.println("Type in the client's name:");
        client.setName(scanner.nextLine());

        System.out.println("Type in the year of birth for this client:");
        client.setYear(scanner.nextInt());
        scanner.nextLine(); // Dummy for the new line characters

        System.out.println("Type in the client's address:");
        client.setAddress(scanner.nextLine());

        System.out.println("The data, provided during the registration are the following:");
        System.out.println("Name: "+client.getName());
        System.out.println("Year of birth: "+client.getYear());
        System.out.println("Address: "+client.getAddress());

        System.out.println("Now please, type in the client's new address:");
        client.migrate(scanner.nextLine());

        System.out.println("The address has been successfully changed.");
        System.out.println("The new address is: "+client.getAddress());
    }
}
