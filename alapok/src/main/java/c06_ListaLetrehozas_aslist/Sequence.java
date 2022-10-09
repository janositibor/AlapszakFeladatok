package c06_ListaLetrehozas_aslist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Sequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //List<Integer> elements=new ArrayList(Arrays.asList(2,1));
        List<Integer> elements=new ArrayList<>(Arrays.asList(2,1));
        System.out.println("How many elements:");
        int length=scanner.nextInt();
        int nextValue;
        for(int i=2;i<length;i++){
            nextValue=elements.get(i-2)*elements.get(i-1);
            elements.add(nextValue);
        }
        System.out.println(elements);
    }
}
