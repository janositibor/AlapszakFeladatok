package e09_TipusKonverzio_conversions;

import java.util.Random;

public class TooBigNumber {
    public long getRightResult(int number){
        return (long) Integer.MAX_VALUE+number;
    }

    public static void main(String[] args) {
        Random rnd = new Random();
        TooBigNumber tooBigNumber=new TooBigNumber();
        int randomInt=1+rnd.nextInt(4096);
        System.out.println(Integer.MAX_VALUE+" + "+randomInt+" = "+tooBigNumber.getRightResult(randomInt));
        System.out.println();
    }
}
