package e03_Karakterek_chars;

import java.util.Scanner;

public class Whitespace {
    public String makeWhitespaceToStar(String text){
        String newText="";
        for (char c: text.toCharArray()) {
            if(Character.isWhitespace(c)){
                newText+='*';
            }
        else{
                newText+=c;
            }
        }
        return newText;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in a random text:");
        String text=scanner.nextLine();
        Whitespace whitespace=new Whitespace();
        System.out.println(whitespace.makeWhitespaceToStar(text));
    }

}
