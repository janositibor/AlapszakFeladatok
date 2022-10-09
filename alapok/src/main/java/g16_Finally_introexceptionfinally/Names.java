package g16_Finally_introexceptionfinally;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Names {
    List<String> namesList = new ArrayList<>();
    public void readInput(String pathString){
        try {
            namesList = Files.readAllLines(Paths.get(pathString));
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Error reading file", ioe);
        }
        finally {
            System.out.println("End of reading.");
        }
    }
    public String firstDr(){
        String dr = "dr";
        for (int i = 0; i < namesList.size(); i++) {
            if (dr.equals(namesList.get(i).substring(0,2))) {
               return namesList.get(i);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        Names names=new Names();
        names.readInput("src/main/java/introexceptionfinally/names_1.txt");
        System.out.println(names.firstDr());
        names.readInput("src/main/java/introexceptionfinally/names_2.txt");
        System.out.println(names.firstDr());
        names.readInput("src/main/java/introexceptionfinally/names_3.txt");
        System.out.println(names.firstDr());
    }
}
