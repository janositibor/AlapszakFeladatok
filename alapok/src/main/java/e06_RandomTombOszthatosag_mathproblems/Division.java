package e06_RandomTombOszthatosag_mathproblems;

import java.util.Arrays;
import java.util.Random;

public class Division {
    public void getDivisors(int number){
        if(number<1){
            System.out.println("Nem pozitív.");
        }
        else{
            System.out.println(number+" osztója: 1");
            for(int i=2;i<=number/2;i++){
                if(number%i==0){
                    System.out.println(number+" osztója: "+i);
                }
            }
            System.out.println(number+" osztója: "+number);
        }
    }
    public void getRightNumbers(int[] numbers){
        for(int i = 1; i<numbers.length; i++){
            if(numbers[i]%i==0){
                System.out.print(numbers[i]+" ");
            }

        }

    }

    public static void main(String[] args) {
        Random rnd = new Random();
        int positiveNumber = 1+rnd.nextInt(1023);
        Division division=new Division();
        division.getDivisors(positiveNumber);
        System.out.println();
        System.out.println();
        int[] arrForRndNumbers = new int[10];
        for (int i = 0; i < arrForRndNumbers.length; i++) {
            arrForRndNumbers[i] = rnd.nextInt(1023)-512;
        }
        System.out.println(Arrays.toString(arrForRndNumbers));
        division.getRightNumbers(arrForRndNumbers);
    }
}
