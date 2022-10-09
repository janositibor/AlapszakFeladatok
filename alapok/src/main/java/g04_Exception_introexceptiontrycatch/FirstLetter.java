package g04_Exception_introexceptiontrycatch;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FirstLetter {
    private Random random = new Random();
    private List<String> wordsList = new ArrayList<>();

    public FirstLetter() {
        int numberOfWords = random.nextInt(10) + 5;
        char[] charArray;
        int numberOfChars;

        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        for (int g = 0; g < numberOfWords; g++) {
            numberOfChars = random.nextInt(8) + 3;
            charArray = new char[numberOfChars];
            for (int i = 0; i < charArray.length; i++) {
                charArray[i] = (char) (random.nextInt(rightLimit + 1 - leftLimit) + leftLimit);
            }
            wordsList.add(String.valueOf(charArray));
        }
    }

    public void printFirstLetters(){
        try{
            /*
            for(String word:wordsList){
                System.out.println(word.charAt(0));
            }
             */
            for(int i=0; i<wordsList.size()+1;i++){
                   System.out.println(wordsList.get(i).charAt(0));
            }
        }
        catch(IndexOutOfBoundsException indexError){
            System.out.println("Indexelési hiba!");
            System.out.println(indexError.getMessage());
            //indexError.printStackTrace();
        }
    }

    public List<String> getWordsList() {
        return wordsList;
    }

    public static void main(String[] args) {
        FirstLetter firstLetter=new FirstLetter();
        System.out.println(firstLetter.getWordsList());
        firstLetter.printFirstLetters();
        System.out.println("End of the program.");
    }
}
