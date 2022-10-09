package c05_ListaAlapok_arraylist;

import java.util.ArrayList;
import java.util.List;

public class Second {
    public static void main(String[] args) {
        int[] numbers = { 3, 9, 42, 67, 4, 0, 76, 14, 84, 35, 92 };
        List<Integer> numberList = new ArrayList<>();
        for (int number: numbers){
            numberList.add(number);
        }
        for (int i = 0; i < numberList.size(); i++){
            if((i+1)%2==0) {
                System.out.println(numberList.get(i));
            }
        }
    }
}
