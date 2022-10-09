package o14_lambdaintermediate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class Cafe {
    private List<CoffeeOrder> ordersList;

    public Cafe(List<CoffeeOrder> ordersList) {
        this.ordersList = ordersList;
    }

    public void add(CoffeeOrder coffeeOrder){
        ordersList.add(coffeeOrder);
    }

    public List<CoffeeOrder> getFirstFiveOrder(LocalDate date){
        return ordersList.stream()
                .filter(order -> order.isSameDay(date))
                .sorted()
                .limit(5)
                .collect(Collectors.toList());
    }

    public List<CoffeeOrder> getOrdersAfter(LocalDateTime from){
        return ordersList.stream()
                .filter(order -> order.getDateTime().isAfter(from))
                .collect(Collectors.toList());
    }

    public long getNumberOfCoffee(CoffeeType type){
        return ordersList.stream()
                .reduce(0, (i,order) -> i+order.numberThisCoffee(type),(i,j) -> i+j);
    }

    public Integer getTotalIncome(LocalDate date){
        return ordersList.stream()
                .filter(order -> order.isSameDay(date))
                .reduce(0, (i,order) -> i+order.getTotalPrice(),(i,j) -> i+j);
    }

    public Integer getTotalIncome(){
        return ordersList.stream()
                .reduce(0, (i,order) -> i+order.getTotalPrice(),(i,j) -> i+j);
    }

    public List<CoffeeOrder> getOrdersList() {
        return ordersList;
    }

}
