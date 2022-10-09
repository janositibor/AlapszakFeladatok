package e03_Karakterek_chars;

import java.util.Scanner;

public class Words {
    public String pushWord(String word){
        String chars="";
        for (char c: word.toCharArray()) {
            char d = (char)(c + 1);
            chars+=d;
        }
        return chars;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in a random text:");
        String text=scanner.nextLine();
        Words words=new Words();
        System.out.println(words.pushWord(text));
    }
}
