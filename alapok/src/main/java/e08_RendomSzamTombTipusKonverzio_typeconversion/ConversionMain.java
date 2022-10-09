package e08_RendomSzamTombTipusKonverzio_typeconversion;

import java.util.Arrays;
import java.util.Random;

public class ConversionMain {
    public static void main(String[] args) {
        Random rnd = new Random();
        Conversion conversion=new Conversion();
        double randomDouble= 128.0 * rnd.nextDouble();
        System.out.println(randomDouble+" after conversion is: "+conversion.convertDoubleToDouble(randomDouble));
        System.out.println();

        int length=5+rnd.nextInt(10);
        int[] arrForRndNumbers = new int[length];
        arrForRndNumbers[0]=0;
        arrForRndNumbers[length-1]=127;
        for (int i = 1; i < arrForRndNumbers.length-1; i++) {
            arrForRndNumbers[i] = rnd.nextInt(512)-128;
        }
        System.out.println("Original: "+Arrays.toString(arrForRndNumbers));
        System.out.println("Converted: "+Arrays.toString(conversion.convertIntArrayToByteArray(arrForRndNumbers)));
        System.out.println();

        randomDouble= 16.0 * rnd.nextDouble();
        System.out.println("The first decimal of "+randomDouble+" is: "+conversion.getFirstDecimal(randomDouble));


    }
}
