package e07_MuveletekSzamokkal_numbers;

import java.util.Scanner;

public class Percent {
    public double getValue(int base, int percentNumber){
        return (double) base*percentNumber/100;
    }
    public double getBase(int percentageValue, int percentNumber){
        return 100.0*percentageValue/percentNumber;
    }
    public double getPercent(int base,int percentageValue){
        return 100.0*percentageValue/base;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Percent percent = new Percent();
        System.out.println("Type in the BASE for the percentage value calculation:");
        int base=scanner.nextInt();
        System.out.println("Type in the PERCENT for the percentage value calculation:");
        int percentNumber=scanner.nextInt();
        System.out.println(percentNumber+" percent of "+base+" is: "+percent.getValue(base,percentNumber));
        System.out.println();

        System.out.println("Type in the PERCENTAGE VALUE for the base calculation:");
        int percentageValue=scanner.nextInt();
        System.out.println("Type in the PERCENT for the base calculation:");
        percentNumber=scanner.nextInt();
        System.out.println("If the PERCENTAGE VALUE is "+percentageValue+" for "+percentNumber+" percentage, then the BASE is: "+percent.getBase(percentageValue,percentNumber));
        System.out.println();

        System.out.println("Type in the BASE for the percent calculation:");
        base=scanner.nextInt();
        System.out.println("Type in the PERCENTAGE VALUE for the percent calculation:");
        percentageValue=scanner.nextInt();
        System.out.println(percentageValue+" is "+percent.getPercent(base,percentageValue)+" percent of "+base+".");




        scanner.nextLine(); // Dummy for the new line characters
    }
}
