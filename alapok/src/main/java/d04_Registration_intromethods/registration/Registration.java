package d04_Registration_intromethods.registration;

import java.time.*;
import java.util.Scanner;

public class Registration {
    public String createName(String firstName, String lastName){
        return firstName+" "+lastName;
    }
    public LocalDate createBirthDate(int year, int month, int day){
        return  LocalDate.of(year, month, day);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in your first name:");
        String firstName=scanner.nextLine();
        System.out.println("Type in your last name:");
        String lastName=scanner.nextLine();
        Registration registration=new Registration();
        String name=registration.createName(firstName, lastName);

        System.out.println("Type in the year of birth:");
        int year=scanner.nextInt();
        System.out.println("Type in the month of birth:");
        int month=scanner.nextInt();
        System.out.println("Type in the day of birth:");
        int day=scanner.nextInt();
        scanner.nextLine(); // Dummy for the new line characters
        LocalDate dateOfBirth=registration.createBirthDate(year, month, day);
        System.out.println("Type in your email address:");
        String email=scanner.nextLine();
        Person person=new Person(name,dateOfBirth,email);
        System.out.println(person.toString());


    }
}
