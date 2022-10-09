package b10_Menu_Vezerles_introcontrol;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Type in an integer:");
            sum+=scanner.nextInt();
        }
        System.out.println("The sum of the five numbers is: "+sum);


    }
}
