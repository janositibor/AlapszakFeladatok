package o14_lambdaintermediate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class CoffeeOrder implements Comparable<CoffeeOrder>{
    private List<Coffee> coffeeList=new ArrayList<>();
    private LocalDateTime dateTime;

    public CoffeeOrder(List<Coffee> coffeeList, LocalDateTime dateTime) {
        this.coffeeList = coffeeList;
        this.dateTime = dateTime;
    }

    @Override
    public int compareTo(CoffeeOrder o) {
        return dateTime.compareTo(o.dateTime);
    }

    public int numberThisCoffee(CoffeeType type){
        int total=0;
        for(Coffee coffee: coffeeList){
            if(coffee.getType()==type){
                total++;
            }
        }
        return total;
    }
    public boolean isSameDay(LocalDate date){
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyyMMdd");
        return dateFormat.format(dateTime).equals(dateFormat.format(date));
    }

    public int getTotalPrice(){
        int total=0;
        for(Coffee coffee:coffeeList){
            total+=coffee.getPrice();
        }
        return total;
    }

    public List<Coffee> getCoffees() {
        return coffeeList;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
}
