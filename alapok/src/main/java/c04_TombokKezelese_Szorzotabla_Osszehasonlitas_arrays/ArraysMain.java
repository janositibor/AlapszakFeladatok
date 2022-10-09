package c04_TombokKezelese_Szorzotabla_Osszehasonlitas_arrays;

import java.time.YearMonth;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysMain {
    String numberOfDaysAsString(){
        int[] numberOfDays =new int[12];
        for (int i = 0; i < 12; i++) {
            YearMonth yearMonthObject = YearMonth.of(2021, i+1);
            int daysInMonth = yearMonthObject.lengthOfMonth();
            numberOfDays[i]=daysInMonth;
        }
        return Arrays.toString(numberOfDays);
    }
    void multiplicationTableAsString(int size){
        int[] innerArray;
        int[][] multiplicationTable=new int[size+1][size+1];
        int multiplicatorI;
        int multiplicatorJ;
        for (int i = 0; i < size+1; i++) {
            innerArray= new int[size+1];
            multiplicatorI=(i==0?1:i);
            for (int j = 0; j < size+1; j++) {
                multiplicatorJ=(j==0?1:j);
                innerArray[j]=multiplicatorI*multiplicatorJ;
            }
            if(i==0){
                innerArray[0]=0;
            }
            multiplicationTable[i]=innerArray;
            System.out.println(Arrays.toString(innerArray));
        }
    }
    void reportSameTempValues(double[] day, double[] anotherDay){
        ArraysMain arraysMain=new ArraysMain();
        System.out.println("Values for day#1: "+ Arrays.toString(day));
        System.out.println("Values for day#2: "+ Arrays.toString(anotherDay));
        if (arraysMain.sameTempValues(day,anotherDay)){
            System.out.println("The values are matched.");
        }
        else{
            System.out.println("The values are different.");
        }
        System.out.println();
    }
    boolean sameTempValues(double[] day, double[] anotherDay){
        return Arrays.equals(day,anotherDay);
    }

    int min(int a, int b){
        if(a<=b){
            return a;
        }
        else{
            return b;
        }
    }
    void reportSameTempValuesDaylight(double[] day, double[] anotherDay){
        ArraysMain arraysMain=new ArraysMain();
        System.out.println("Values for day#1: "+ Arrays.toString(day));
        System.out.println("Values for day#2: "+ Arrays.toString(anotherDay));
        if (arraysMain.sameTempValuesDaylight(day,anotherDay)){
            System.out.println("The values are matched.");
        }
        else{
            System.out.println("The values are different.");
        }
        System.out.println();
    }
    boolean sameTempValuesDaylight(double[] day, double[] anotherDay){
        int shorterLength=min(day.length,anotherDay.length);
        double[] shorterDay=Arrays.copyOfRange(day,0,shorterLength);
        double[] shorterAnotherDay=Arrays.copyOfRange(anotherDay,0,shorterLength);
        return sameTempValues(shorterDay,shorterAnotherDay);
    }
    void reportWonLottery(int[] tip, int[] winner){
        ArraysMain arraysMain=new ArraysMain();
        System.out.println("Tip: "+ Arrays.toString(tip));
        System.out.println("Winner: "+ Arrays.toString(winner));
        if (arraysMain.wonLottery(tip,winner)){
            System.out.println("You are the winner!");
        }
        else{
            System.out.println("Unfortunately not this time.");
        }
    }
    boolean wonLottery(int[] tip, int[] winner){
        Arrays.sort(tip);
        Arrays.sort(winner);
        return Arrays.equals(tip,winner);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArraysMain arraysMain=new ArraysMain();
        System.out.println("Number of the days in the months are the following:");
        System.out.println(arraysMain.numberOfDaysAsString());

        System.out.println();
        System.out.println("Type in the size of multiplication table:");
        int size=scanner.nextInt();
        arraysMain.multiplicationTableAsString(size);

        System.out.println();
        System.out.println("Both days do contain 24 hours:");
        double[] day = {4.1,7.2,9.0,3.9,3.7,2.8,1.7,1.1,2.0,-3.6,1.5,2.7,2.0,4.0,6.7,2.7,4.1,8.5,16.8,4.6,6.7,2.7,15.2,4.7};
        double[] anotherDay = {4.1,7.2,9.0,3.9,3.7,2.8,1.7,1.1,2.0,-3.6,1.5,2.7,2.0,4.0,6.7,2.7,4.1,8.5,16.8,4.6,6.7,2.7,15.2,4.7};
        arraysMain.reportSameTempValues(day,anotherDay);

        double[] day2 = {4.1,7.2,9.0,3.9,3.7,2.8,1.7,1.1,2.0,-3.6,1.5,2.7,2.0,4.0,6.7,2.7,4.1,8.5,16.8,4.6,6.7,2.7,15.2,4.7};
        double[] anotherDay2 = {4.1,7.2,9.0,3.9,3.7,2.8,1.7,1.1,2.0,-3.6,1.5,2.7,2.0,4.0,6.7,2.7,4.1,8.5,16.8,4.6,6.7,2.7,15.2,4.8};
        arraysMain.reportSameTempValues(day2,anotherDay2);

        System.out.println("The days may be shorter or longer than 24 hours:");
        double[] day3 = {4.1,7.2,9.0,3.9,3.7,2.8,1.7,1.1,2.0,-3.6,1.5,2.7,2.0,4.0,6.7,2.7,4.1,8.5,16.8,4.6,6.7,2.7,15.2,4.7,4.8};
        double[] anotherDay3 = {4.1,7.2,9.0,3.9,3.7,2.8,1.7,1.1,2.0,-3.6,1.5,2.7,2.0,4.0,6.7,2.7,4.1,8.5,16.8,4.6,6.7,2.7,15.2,4.7};
        arraysMain.reportSameTempValuesDaylight(day3,anotherDay3);

        double[] day4 = {4.1,7.2,9.0,3.9,3.7,2.8,1.7,1.1,2.0,-3.6,1.5,2.7,2.0,4.0,6.7,2.7,4.1,8.5,16.8,4.6,6.7,2.7,15.2,4.7};
        double[] anotherDay4 = {4.1,7.2,9.0,3.9,3.7,2.8,1.7,1.1,2.0,-3.6,1.5,2.7,2.0,4.0,6.7,2.7,4.1,8.5,16.8,4.6,6.7,2.7,15.2,4.8};
        arraysMain.reportSameTempValuesDaylight(day4,anotherDay4);

        double[] day5 = {4.1,7.2,9.0,3.9,3.7,2.8,1.7,1.1,2.0,-3.6,1.5,2.7,2.0,4.0,6.7,2.7,4.1,8.5,16.8,4.6,6.7,2.7,15.2};
        double[] anotherDay5 = {4.1,7.2,9.0,3.9,3.7,2.8,1.7,1.1,2.0,-3.6,1.5,2.7,2.0,4.0,6.7,2.7,4.1,8.5,16.8,4.6,6.7,2.7,15.2,4.8};
        arraysMain.reportSameTempValuesDaylight(day5,anotherDay5);

        double[] day6 = {4.1,7.2,9.0,3.9,3.7,2.8,1.7,1.1,2.0,-3.6,1.5,2.7,2.0,4.0,6.7,2.7,4.1,8.5,16.8,4.6,6.7,2.7,15.2};
        double[] anotherDay6 = {4.1,7.2,9.0,3.9,3.7,2.8,1.7,1.1,2.0,-3.6,1.5,2.7,2.0,4.0,6.7,2.7,4.1,8.5,16.8,4.6,6.7,2.7,15.3,4.8};
        arraysMain.reportSameTempValuesDaylight(day6,anotherDay6);

        int[] tip={1,2,3,4,5};
        int[] winner={5,2,3,4,11};
        int[] winnerClone = winner.clone();
        arraysMain.reportWonLottery(tip,winnerClone);
        System.out.println("winner: "+ Arrays.toString(winner));
        System.out.println();

        int[] tip2={1,2,3,4,5};
        int[] winner2={5,2,3,4,1};
        winnerClone = winner2.clone();
        arraysMain.reportWonLottery(tip2,winnerClone);
        System.out.println("winner: "+ Arrays.toString(winner2));
    }
}
