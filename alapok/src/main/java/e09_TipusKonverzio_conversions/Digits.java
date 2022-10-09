package e09_TipusKonverzio_conversions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Digits {
    private List<Integer> numberList = new ArrayList<>();

    public void addDigitsToList(String text){
        for (char c: text.toCharArray()){
            if(Character.isDigit(c)){
                numberList.add(Character.getNumericValue(c));
            }
        }
    }

    public List<Integer> getNumberList() {
        return numberList;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in a random text:");
        String text=scanner.nextLine();
        Digits digits=new Digits();
        digits.addDigitsToList(text);
        System.out.println("The digits are: "+digits.getNumberList());
    }

}
