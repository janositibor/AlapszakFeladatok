package a001_KonzolKommunikacio_classstructureio;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the first operand?");
        int op1 = scanner.nextInt();

        System.out.println("What is the second operand?");
        int op2 = scanner.nextInt();

        System.out.println(op1+" + " +op2+" = ");
        System.out.println(op1+op2);
    }
}
