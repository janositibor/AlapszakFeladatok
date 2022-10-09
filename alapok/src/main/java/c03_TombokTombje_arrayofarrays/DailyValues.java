package c03_TombokTombje_arrayofarrays;
import java.time.*;

public class DailyValues {
    int[][] getValues(){
        int[] innerArray;
        int[][] dailyValuesMatrix=new int[12][];
        for (int i = 0; i < 12; i++) {
            YearMonth yearMonthObject = YearMonth.of(2021, i+1);
            int daysInMonth = yearMonthObject.lengthOfMonth();
            innerArray= new int[daysInMonth];
            dailyValuesMatrix[i]=innerArray;
        }
        return dailyValuesMatrix;
    }
    public static void main(String[] args) {
        DailyValues dailyValues=new DailyValues();
        int[][] dailyValuesMatrix=dailyValues.getValues();
        for (int i = 0; i < dailyValuesMatrix.length; i++) {
            System.out.println(i+1+" length: "+dailyValuesMatrix[i].length);
        }
    }
}
