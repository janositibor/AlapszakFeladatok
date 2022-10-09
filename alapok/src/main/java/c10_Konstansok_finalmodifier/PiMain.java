package c10_Konstansok_finalmodifier;

import java.util.Scanner;

public class PiMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CircleCalculator circleCalculator=new CircleCalculator();
        System.out.println("Type in the radius of the circle:");
        int radius=scanner.nextInt();
        System.out.println("The perimeter is: "+circleCalculator.calculatePerimeter(radius));
        System.out.println("The area is: "+circleCalculator.calculateArea(radius));
        System.out.println();

        CylinderCalculator cylinderCalculator=new CylinderCalculator();
        System.out.println("Type in the height of the cylinder:");
        int height=scanner.nextInt();
        System.out.println("The surface is: "+cylinderCalculator.calculateSurfaceArea(radius,height));
        System.out.println("The volume is: "+cylinderCalculator.calculateVolume(radius,height));
        System.out.println();
        System.out.println("Another method for calculation:");

        CylinderCalculatorBasedOnCircle cylinderCalculatorBasedOnCircle=new CylinderCalculatorBasedOnCircle();
        System.out.println("The surface is: "+cylinderCalculatorBasedOnCircle.calculateSurfaceArea(radius,height));
        System.out.println("The volume is: "+cylinderCalculatorBasedOnCircle.calculateVolume(radius,height));

    }
}
