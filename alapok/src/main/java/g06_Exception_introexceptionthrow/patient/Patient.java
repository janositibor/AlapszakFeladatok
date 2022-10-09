package g06_Exception_introexceptionthrow.patient;

import java.util.Scanner;

public class Patient {
    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean registrationFailed=false;
        System.out.println("Please, provide data for the registration!");
        System.out.println("Type in the name!");
        String name = scanner.nextLine();
        System.out.println("Type in the social security number!");
        String socialSecurityNumber = scanner.nextLine();
        System.out.println("Type in the year of birth!");
        int yearOfBirth = scanner.nextInt();
        System.out.println("-----------------------------------------------------------------------");
        try{
            Patient patient=new Patient(name, socialSecurityNumber, yearOfBirth);
        }
        catch(IllegalArgumentException iae){
            registrationFailed=true;
            System.out.println(iae.getMessage());
        }
        System.out.println("Name: "+name);
        System.out.println("Social security number: "+socialSecurityNumber);
        System.out.println("Year of birth: "+yearOfBirth);
        String registrationWasSuccessfulString=registrationFailed?"The registration was NOT successful!":"The registration was successful!";
        System.out.println(registrationWasSuccessfulString);


    }
    public Patient(String name, String socialSecurityNumber, int yearOfBirth) {
        if(name.trim().isEmpty()) {
            throw new IllegalArgumentException("No name provided!");
        }
        SsnValidator ssnValidator=new SsnValidator();
        if(!ssnValidator.isValidSsn(socialSecurityNumber)) {
            throw new IllegalArgumentException("Not valid social security number!");
        }
        if(yearOfBirth<1900) {
            throw new IllegalArgumentException("Too old!");
        }
        if(yearOfBirth>2021) {
            throw new IllegalArgumentException("Too young!");
        }
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
