package e03_Karakterek_chars;

import java.util.Scanner;

public class LettersAndDigits {
    public void printLetterOrDigit(String text){
        for (char c: text.toCharArray()) {
            System.out.print(c+": ");
            if(Character.isAlphabetic(c)){
                System.out.println("betű");
            }
            else if (Character.isDigit(c)){
                System.out.println("szám");
            }
            else{
                System.out.println("egyéb");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in a random text:");
        String text=scanner.nextLine();
        LettersAndDigits lettersAndDigits=new LettersAndDigits();
        lettersAndDigits.printLetterOrDigit(text);

    }
}
