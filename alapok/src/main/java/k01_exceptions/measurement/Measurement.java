package k01_exceptions.measurement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Measurement {
    public List<String> readFromFile(Path path){
        //Paths.get("src/test/resources/measurementdata.csv")
        try {
            return Files.readAllLines(path);
        } catch (IOException ioe) {
            //throw new IllegalStateException("Can not read file: "+path, ioe);
            throw new IllegalStateException("Can not read file.", ioe);
        }
    }
    public List<String> validate(List<String> listToValidate){
        List<String> errorsList=new ArrayList<>();
        String[] valuesArray;
        String message;
        for(String line:listToValidate){
            valuesArray=line.split(",");
            if(valuesArray.length!=3||isProblemWithInt(valuesArray[0])||isProblemWithDouble(valuesArray[1])||isProblemWithName(valuesArray[2])){
                errorsList.add(line);
            }
        }
        return errorsList;
    }

    private boolean isProblemWithName(String input) {
        if(!input.contains(" ")){
            return true;
        }
        return false;
    }

    private boolean isProblemWithInt(String input){
        try{
            Integer.parseInt(input);
            return false;
        }
        catch(NumberFormatException nfe){
            return true;
        }
   }
   private boolean isProblemWithDouble(String input){
        try{
            Double.parseDouble(input);
            return false;
        }
        catch(NumberFormatException nfe){
            return true;
        }
    }
}
