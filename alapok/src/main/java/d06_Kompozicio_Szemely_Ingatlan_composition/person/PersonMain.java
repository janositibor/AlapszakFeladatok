package person;

import java.util.Scanner;

public class PersonMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in the name:");
        String name=scanner.nextLine();
        System.out.println("Type in the ID no.:");
        String identificationCard=scanner.nextLine();
        System.out.println("Type in the country:");
        String country=scanner.nextLine();
        System.out.println("Type in the city:");
        String city=scanner.nextLine();
        System.out.println("Type in the street and number:");
        String streetAndNumber=scanner.nextLine();
        System.out.println("Type in the ZIP code");
        String zipCode=scanner.nextLine();

        Address address=new Address(country, city, streetAndNumber, zipCode);
        Person person=new Person(name, identificationCard, address);
        System.out.println();
        System.out.println(person.personToString());
        System.out.println();

        System.out.println("Type in the new country:");
        country=scanner.nextLine();
        System.out.println("Type in the new city:");
        city=scanner.nextLine();
        System.out.println("Type in the new street and number:");
        streetAndNumber=scanner.nextLine();
        System.out.println("Type in the new ZIP code");
        zipCode=scanner.nextLine();
        Address newAddress=new Address(country, city, streetAndNumber, zipCode);
        person.moveTo(newAddress);
        System.out.println(person.personToString());

    }
}
