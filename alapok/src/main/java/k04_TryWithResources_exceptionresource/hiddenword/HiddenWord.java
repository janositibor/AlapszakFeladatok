package k04_TryWithResources_exceptionresource.hiddenword;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class HiddenWord {
    public String getHiddenWord(Path path){
        StringBuilder stringBuilder=new StringBuilder();
        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                stringBuilder.append(letterFromLine(line));
            }
            return stringBuilder.toString();
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    private char letterFromLine(String line) {
        char[] charArray=line.toCharArray();
        for(char c:charArray){
            if(Character.isAlphabetic(c)){
               return c;
            }
        }
        return ' ';
    }
}
