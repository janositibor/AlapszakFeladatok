package c10_Konstansok_finalmodifier;

public class CylinderCalculatorBasedOnCircle {
    double calculateVolume(double r, double h){
        CircleCalculator circleCalculator=new CircleCalculator();
        return circleCalculator.calculateArea(r)*h;

    }
    double calculateSurfaceArea(double r, double h){
        CircleCalculator circleCalculator=new CircleCalculator();
        return 2*circleCalculator.calculateArea(r)+circleCalculator.calculatePerimeter(r)*h;
    }
}
