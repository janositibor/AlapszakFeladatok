package b07_registration;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        String correct="The provided data is correct";
        String notCorrect="The provided data is NOT correct";
        Scanner scanner = new Scanner(System.in);
        UserValidator userValidator=new UserValidator();

        System.out.println("Type in the username:");
        String username=scanner.nextLine();
        String answer=userValidator.isValidUsername(username)?correct:notCorrect;
        System.out.println(answer);

        System.out.println();
        System.out.println("Type in the email address:");
        String email=scanner.nextLine();
        answer=userValidator.isValidEmail(email)?correct:notCorrect;
        System.out.println(answer);

        System.out.println();
        System.out.println("Type in the password:");
        String password1=scanner.nextLine();
        System.out.println("Type in the password again:");
        String password2=scanner.nextLine();
        answer=userValidator.isValidPassword(password1,password2)?correct:notCorrect;
        System.out.println(answer);

    }
}
