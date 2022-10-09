package n04_Rendezes_sorting;

import java.util.ArrayList;
import java.util.List;

public class CarDealer {
    List<Car> carsList=new ArrayList<>();

        public void addCar(Car car){
        carsList.add(car);
    }

    public List<Car> getCarsOrderedByPrice(){
        List<Car> orderedList=new ArrayList<>(carsList);
        orderedList.sort(new CarPriceComparator());
        return orderedList;
    }
    public List<Car> getCarsOrderedByYearOfConstruction(){
        List<Car> orderedList=new ArrayList<>(carsList);
        orderedList.sort(new CarConstructionComparator());
        return orderedList;
    }

}
