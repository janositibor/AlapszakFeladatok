package c10_Konstansok_finalmodifier;
import static c10_Konstansok_finalmodifier.CircleCalculator.PI;

public class CylinderCalculator {

    double calculateVolume(double r, double h){
        return r*r*PI*h;

    }
    double calculateSurfaceArea(double r, double h){
        return 2*r*r*PI+2*r*PI*h;
    }
}
