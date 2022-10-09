package a001_KonzolKommunikacio_classstructureio;
import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type in your name, please:");
        String name = scanner.nextLine();

        System.out.println("Type in your email address, please:");
        String emailCim = scanner.nextLine();

        System.out.println("The data, provided during the registration are the following:");
        System.out.println("Name: "+name);
        System.out.println("Email Address: "+emailCim);
    }
}
