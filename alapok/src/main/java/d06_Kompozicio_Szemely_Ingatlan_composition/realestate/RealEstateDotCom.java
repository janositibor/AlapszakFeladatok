package realestate;

import java.util.Scanner;

public class RealEstateDotCom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type in the title:");
        String title=scanner.nextLine();
        System.out.println("Type in the price:");
        double price=scanner.nextDouble();
        scanner.nextLine(); // Dummy for the new line characters
        System.out.println("Type in the description:");
        String description=scanner.nextLine();
        System.out.println("Type in the area of house:");
        int squareMeter=scanner.nextInt();
        scanner.nextLine(); // Dummy for the new line characters
        System.out.println("Type in the area of site:");
        int areaOfSite=scanner.nextInt();
        scanner.nextLine(); // Dummy for the new line characters
        System.out.println("Type in the city:");
        String city=scanner.nextLine();
        System.out.println("Type in the ZIP code:");
        String zipCode=scanner.nextLine();
        System.out.println("Type in the street:");
        String street=scanner.nextLine();
        System.out.println("Type in the houseNumber:");
        int houseNumber=scanner.nextInt();
        scanner.nextLine(); // Dummy for the new line characters

        Address address=new Address(city, zipCode, street, houseNumber);
        Details details=new Details(description, address, squareMeter, areaOfSite);
        RealEstate realEstate=new RealEstate(title, price, details);
        System.out.println(realEstate);

        System.out.println();
        System.out.println("Type in the new houseNumber:");
        houseNumber=scanner.nextInt();
        scanner.nextLine(); // Dummy for the new line characters
        realEstate.getDetails().getAddress().setHouseNumber(houseNumber);
        System.out.println(realEstate);

    }
}
