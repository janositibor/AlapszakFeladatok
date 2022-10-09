package m05_FileToMap_collectionsmap;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassTrip {
    private Map<String, Integer> records=new HashMap<>();

    public Map<String, Integer> getInpayments() {
        return records;
    }
    public void loadInpayments(Path path){
        process(readFromFile(path));
    }
    public List<String> readFromFile(Path path){
        //Paths.get("src/test/resources/inpayments.txt")
        try {
            return Files.readAllLines(path);
        } catch (IOException ioe) {
//            throw new IllegalStateException("Can not read file: "+path, ioe);
            throw new IllegalStateException("Can not read file.", ioe);
        }
    }
    private void process(List<String> listToValidate){
        String[] fieldsArray;
        for(String line:listToValidate){
            fieldsArray=line.split(": ");
            if(fieldsArray.length==2&&isValidName(fieldsArray[0])&&isValidInt(fieldsArray[1])){
                records.put(fieldsArray[0],Integer.parseInt(fieldsArray[1]));
            }
        }
    }
    private boolean isValidName(String input) {
        if(input==null){
            throw new NullPointerException("The name is null!");
        }
        if(!input.contains(" ")){
            return false;
        }
        return true;
    }

    private boolean isValidInt(String input){
        try{
            Integer.parseInt(input);
            return true;
        }
        catch(NumberFormatException nfe){
            throw new NumberFormatException("Problem with the amount!");
        }
    }


}
