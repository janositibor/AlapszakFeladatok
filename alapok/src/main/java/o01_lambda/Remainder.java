package o01_lambda;

import java.util.ArrayList;
import java.util.List;

public class Remainder {
    public List<Integer> changeNumbersToRemainders(List<Integer> numbers, int divisor){
        List<Integer> outputList=new ArrayList<>(numbers);
        outputList.replaceAll(number -> number%divisor);
        return outputList;
    }
}
