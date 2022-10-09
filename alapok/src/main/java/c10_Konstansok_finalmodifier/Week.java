package c10_Konstansok_finalmodifier;

import java.util.Arrays;
import java.util.List;

public class Week {
    public static void main(String[] args) {
        String[] daysOfWeek = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        List<String> daysOfWeekList = Arrays.asList(daysOfWeek);
        System.out.println("The days of week: "+   daysOfWeekList);
        daysOfWeekList.set(1, "Wednesday");
        System.out.println("After replace: "+   daysOfWeekList);

    }
}
