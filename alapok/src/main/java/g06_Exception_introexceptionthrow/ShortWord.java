package g06_Exception_introexceptionthrow;
import java.util.Scanner;

public class ShortWord {
    public boolean isAlpha(String str) {
        char[] chars = str.toCharArray();

        for (char c : chars) {
            if(!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShortWord shortWord=new ShortWord();

        System.out.println("Type in a 5-letter long word:");
        String userInput = scanner.nextLine();
        try{
            if(userInput.length()!=5) {
                throw new IllegalArgumentException("Length of the word does NOT match criteria!");
            }
            else{
                if(!shortWord.isAlpha(userInput)){
                    throw new IllegalArgumentException("It should contains only letters!");
                }
                else{
                    System.out.println(userInput);
                }
            }
        }
        catch(IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }
    }
}
