package g16_Finally_introexceptionfinally;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Numbers {
    private Scanner scanner = new Scanner(System.in);

    public void printMenu(){
        printVerticalSeparator(2);
        System.out.println("Type in an integer\n" +
                "To quit type in an even number!");
    }
    private void printVerticalSeparator(int repeat) {
        System.out.println();
        for(int i=1;i<=repeat;i++) {
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }
    public void runMenu(){
        int inputFromUser=0;
        do{
            printMenu();
            try {
                inputFromUser = scanner.nextInt();
            }
            catch (InputMismatchException ime) {
                throw new IllegalStateException("It is not an integer!\n", ime);
            }
            finally {
                System.out.println("End of round.");
            }
        }
        while(inputFromUser%2!=0);
    }
    public static void main(String[] args) {
        Numbers numbers=new Numbers();
        numbers.runMenu();
    }
}
