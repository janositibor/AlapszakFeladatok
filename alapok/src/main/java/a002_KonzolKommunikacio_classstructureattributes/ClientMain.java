package a002_KonzolKommunikacio_classstructureattributes;
import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Client client = new Client();

        System.out.println("Type in the client's name:");
        client.name = scanner.nextLine();

        System.out.println("Type in the year of birth for this client:");
        client.year = scanner.nextInt();
        scanner.nextLine(); // Dummy for the new line characters

        System.out.println("Type in the client's address:");
        client.address = scanner.nextLine();

        System.out.println("The data, provided during the registration are the following:");
        System.out.println("Name: "+client.name);
        System.out.println("Year of birth: "+client.year);
        System.out.println("Address: "+client.address);
    }
}
