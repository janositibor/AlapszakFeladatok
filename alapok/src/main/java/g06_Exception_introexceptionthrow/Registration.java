package g06_Exception_introexceptionthrow;
import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Validation validation=new Validation();
        boolean registrationFailed=false;
        System.out.println("Dear Guest,");
        System.out.println("Please, provide data for the registration!");
        System.out.println("What's your name?");
        String name = scanner.nextLine();
        try{
            validation.validateName(name.trim());
        }
        catch(IllegalArgumentException iae){
            registrationFailed=true;
            System.out.println(iae.getMessage());
        }
        System.out.println("What's your age?");
        String ageString = scanner.nextLine();
        try{
            validation.validateAge(ageString);
        }
        catch(IllegalArgumentException iae){
            registrationFailed=true;
            System.out.println(iae.getMessage());
        }
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Name: "+name);
        System.out.println("Age: "+ageString+" year");
        String registrationWasSuccessfulString=registrationFailed?"The registration was NOT successful!":"The registration was successful!";
        System.out.println(registrationWasSuccessfulString);
    }
}
