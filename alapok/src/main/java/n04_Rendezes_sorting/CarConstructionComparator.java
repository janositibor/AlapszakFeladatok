package n04_Rendezes_sorting;

import java.util.Comparator;

public class CarConstructionComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getYearOfProduction()-o2.getYearOfProduction();
    }
}
