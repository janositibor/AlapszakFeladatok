package f04_Airport_Palindroma_stringbuilder;

import java.util.Scanner;

public class PalindromeValidator {
    public boolean isPalindrome(String word){
        StringBuilder sbWord=new StringBuilder(word);
        StringBuilder wordReversed=sbWord.reverse();
        return word.equalsIgnoreCase(wordReversed.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in a palindrome:");
        String text=scanner.nextLine();
        PalindromeValidator palindromeValidator=new PalindromeValidator();
        String output=palindromeValidator.isPalindrome(text)?"'"+text+"' is a palindrome":"'"+text+"' is NOT a palindrome";
        System.out.println(output);
    }
}
