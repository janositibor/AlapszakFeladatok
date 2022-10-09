package k03_exceptionmulticatch.aid;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Aid {
    private int amount;
    private String SEPARATOR=": ";

    public Aid(int amount) {
        this.amount = amount;
    }

    public List<String> countAmountsOfAid(Path path){
        List<String> output=new ArrayList<>();
        try {
            List<String> lines=Files.readAllLines(path);
            for(String line:lines){
                String[] fields =  line.split(SEPARATOR);
                CityForAid cityForAid=new CityForAid(amount,fields[0],Integer.parseInt(fields[1]));
                output.add(cityForAid.toString());

            }
        }
        catch (NullPointerException | NumberFormatException | IndexOutOfBoundsException | IOException | ArithmeticException e) {
            throw new IllegalStateException("Something went wrong while counting.",e);
        }
        return output;
    }
}
