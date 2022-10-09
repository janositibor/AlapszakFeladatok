package e07_MuveletekSzamokkal_numbers;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("3.1 + 5.0 / 2.0 - 1 =");
        double result=scanner.nextDouble();
        double delta=0.0001;
        String evaluation=Math.abs((3.1 + 5.0 / 2.0 - 1) - result) < delta?"The answer is correct.":"Unfortunately the answer is NOT correct.";
        System.out.println(evaluation);
    }
}
