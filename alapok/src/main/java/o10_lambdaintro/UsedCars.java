package o10_lambdaintro;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class UsedCars {
    List<Car> carsList=new ArrayList<>();

    public UsedCars(List<Car> carsList) {
        this.carsList = carsList;
    }

    private List<Car> orderingCarList(Comparator<Car> comp){
        List<Car> outputList=new ArrayList<>(carsList);
        outputList.sort(comp);
        return outputList;
    }

    public List<Car> listCarsByPrice(){
        return orderingCarList((car1,car2)-> car1.getPrice()-car2.getPrice());
    }
    public List<Car> listCarsByLengthDesc(){
        return orderingCarList((car1,car2)-> (int) (100*(car2.getLength()-car1.getLength())));
    }
    public List<Car> listCarsOneBrandByType(String brand){
        List<Car> outputList=new ArrayList<>(filterCarList(car -> car.getBrand().equals(brand)));
        outputList.sort((car1,car2)-> car1.getType().compareTo(car2.getType()));
        return outputList;
    }
    public List<Car> filterCarList(Predicate<Car> condition) {
        List<Car> outputList=new ArrayList<>();
        for (Car car: carsList) {
            if (condition.test(car)) {
                outputList.add(car);
            }
        }
        return outputList;
    }
}
