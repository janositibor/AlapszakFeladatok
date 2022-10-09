package f05_GenerateRandomAlphanumericString_stringseparate;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Codes {
    public String generateRandomAlphanumericString(int targetStringLength) {
        int leftLimit = 48; // numeral '0'
        //int rightLimit = 122; // letter 'z'
        int rightLimit = 100;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return generatedString;
    }

    public static void main(String[] args) {
        Codes codes=new Codes();
        List<String> codesList = new ArrayList<>();
        for(int i=0; i<20; i++){
            codesList.add(codes.generateRandomAlphanumericString(5));
        }
        System.out.println("A teljes lista: "+codesList);
        System.out.println();

        StringBuilder output=new StringBuilder("Betűvel kezdődő kódok: ");
        boolean first = true;
        for (String code: codesList) {
            char firstChar = code.charAt(0);
            if(Character.isAlphabetic(firstChar)){
                if (first) {
                    first = false;
                }
                else {
                    output.append(", ");
                }
            output.append(code);
            }
        }
        System.out.println(output);
    }
}
