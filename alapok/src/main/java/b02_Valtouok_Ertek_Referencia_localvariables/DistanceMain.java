package b02_Valtouok_Ertek_Referencia_localvariables;

public class DistanceMain {
    public static void main(String[] args) {
        Distance distance=new Distance(29.65,true);
        double doubleDistance=distance.getDistanceInKm();
        //long intDistance=Math.round(doubleDistance);
        int intDistance= (int) doubleDistance;
        boolean exact= distance.isExact();
        if (exact) {
            System.out.println("The distance is exact, and it is: "+doubleDistance+" km");
        }
        else{
            System.out.println("The distance is not exact, and approximately it is: "+doubleDistance+" km");
        }
        System.out.println("The rounded distance is: "+intDistance+" km");

    }
}
