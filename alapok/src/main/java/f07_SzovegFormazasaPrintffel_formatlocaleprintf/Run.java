package f07_SzovegFormazasaPrintffel_formatlocaleprintf;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Run {
    private List<Double> distancesList;
    private String name;

    public Run(String name) {
        this.distancesList = new ArrayList<>();
        this.name = name;
    }
    public void addRun(double km){
        distancesList.add(km);
    }
    public String printFormattedRunText(){
        String mondat=String.format("Kedves %s! A mai dátum: %tF (%tA). Ezen a héten ez a(z) %d. futásod. Most %.1f km-t futottál. Csak így tovább!",name,new Date(),new Date(),distancesList.size(),distancesList.get(distancesList.size()-1));
        return mondat;
    }

    public static void main(String[] args) {
        Run run=new Run("Kiss Béla");
        run.addRun(2.5);
        System.out.println(run.printFormattedRunText());
        System.out.println();
        run.addRun(3.1);
        System.out.println(run.printFormattedRunText());
        System.out.println();
        run.addRun(3.9);
        System.out.println(run.printFormattedRunText());

    }
}
