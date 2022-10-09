package e05_OsztasEredmenye_StringNullVagyUres_operators;

import java.util.Random;

public class OperatorsMain {
    public static void main(String[] args) {
        Random rnd = new Random();
        Operators operators=new Operators();
        int intValue = rnd.nextInt(1023);
        System.out.println(intValue+" in binary form: "+Integer.toBinaryString(intValue));
        System.out.println(intValue+" is even: "+operators.isEven(intValue));
        int intValue2 = rnd.nextInt(255);
        System.out.println(operators.getResultOfDivision(intValue,intValue2));
        System.out.println();
        System.out.println("//isNull(\"Barmi\"):");
        System.out.println(operators.isNull("Barmi"));
        System.out.println("//isNull(null):");
        System.out.println(operators.isNull(null));
        System.out.println();
        System.out.println("//isEmpty(\"Barmi\"):");
        System.out.println(operators.isEmpty("Barmi"));
        System.out.println("//isEmpty(null):");
        System.out.println(operators.isEmpty(null));
        System.out.println("//isEmpty(\"\"):");
        System.out.println(operators.isEmpty(""));
    }
}
