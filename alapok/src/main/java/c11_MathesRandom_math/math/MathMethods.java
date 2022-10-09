package c11_MathesRandom_math.math;

import java.util.Scanner;
import java.util.Random;
public class MathMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in an integer:");
        int number1=scanner.nextInt();
        System.out.println("Type in an other integer:");
        int number2=scanner.nextInt();
        System.out.println("The greater one is: "+Math.max(number1, number2));
        System.out.println("The less one is: "+Math.min(number1, number2));
        System.out.println("The sum of them: "+Math.addExact(number1, number2));
        System.out.println("The difference between them: "+Math.abs(Math.subtractExact(number1, number2)));
        System.out.println("The multiplication of them: "+Math.multiplyExact(number1, number2));
        System.out.println(number1+" + 1 = "+Math.incrementExact(number1));
        System.out.println(number2+" + 1 = "+Math.incrementExact(number2));
        System.out.println(Math.incrementExact(number1)+" - 1 = "+Math.decrementExact(Math.incrementExact(number1)));
        System.out.println(Math.incrementExact(number2)+" - 1 = "+Math.decrementExact(Math.incrementExact(number2)));
        System.out.println();
        System.out.println("Type in the number of decimal places for rounding PI:");
        int numberOfDecimalPlaces=scanner.nextInt();
        System.out.println("The value of Pi is: "+Math.PI);
        double tempForRound=Math.pow(10,numberOfDecimalPlaces);
        System.out.println("The rounded value of Pi is: "+Math.round(Math.PI*tempForRound)/tempForRound);
        System.out.println();
        System.out.println("Type in a number:");
        double numberForAbs=scanner.nextDouble();
        System.out.println("The absolute value for "+numberForAbs+" is: "+Math.abs(numberForAbs));
        System.out.println("The absolute value for "+numberForAbs*(-1)+" is: "+Math.abs(numberForAbs*(-1)));
        System.out.println();

        Random rnd = new Random(1984);
        System.out.println("Random number between 0 and 1: "+rnd.nextDouble());


    }

}
