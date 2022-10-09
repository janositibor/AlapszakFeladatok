package g06_Exception_introexceptionthrow;
import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double userInputNumber;

        System.out.println("Type in a positive number:");
        try{
            if(scanner.hasNextDouble()) {
                userInputNumber = scanner.nextDouble();
            }
            else{
                throw new IllegalArgumentException("Not a number!");
            }
            if(userInputNumber<0){
                throw new IllegalArgumentException("Not a positive number!");
            }
        }
        catch(IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }
    }
}
