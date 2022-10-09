package c08_ModositasBejaraskor_looptypesmodify;

import java.util.Arrays;

public class EveryThird {
    public int[] changeToZero(int[] numbers){
        int length=numbers.length;
        for(int i=length; i>0; i--){
            if((length-i)%3==0){
                numbers[i-1]=0;
            }
        }
        return numbers;
    }
    public static void main(String[] args) {
        int[] numbersArray = {1, 2, 3, 4, 6, 2, 6, 3, 5, 7, 2, 6, 2, 3, 5, 7, 3, 2, 9};
        System.out.println(Arrays.toString(numbersArray));
        EveryThird everyThird=new EveryThird();
        everyThird.changeToZero(numbersArray);
        System.out.println(Arrays.toString(numbersArray));
    }
}
