package g13_WriteFile_introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputFromUser="";
        String escapeString="x";
        List<String> toDoList=new ArrayList<>();

        do{
            if(!inputFromUser.isEmpty()){
                toDoList.add(inputFromUser);
            }
            System.out.println("Type in something to do:");
            inputFromUser = scanner.nextLine();
        }
        while(!escapeString.equals(inputFromUser));
        try {
            Files.write(Paths.get("src/main/java/introexceptionwritefile/todos.txt"), toDoList);
        }
        catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
