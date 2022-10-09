package c10_Konstansok_finalmodifier;

public class CircleCalculator {
    public static final double PI=Math.PI;
    double calculatePerimeter(double r){
        return 2*r*PI;
    }
    double calculateArea(double r){
        return r*r*PI;
    }
}
