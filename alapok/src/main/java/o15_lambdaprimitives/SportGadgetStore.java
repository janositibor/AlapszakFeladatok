package o15_lambdaprimitives;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SportGadgetStore {
    private List<Product> productsList;

    public SportGadgetStore(List<Product> productsList) {
        this.productsList = productsList;
    }

    public String getExpensiveProductStatistics(double minPrice) {
        Stream<Product> objStream = productsList.stream()
                .filter(product -> product.getPrice() > minPrice);
        IntStream intStream = objStream.mapToInt(s -> s.getAmount());
        IntSummaryStatistics stats = intStream.summaryStatistics();
        if (stats.getCount() > 0) {
            return "Összesen " + stats.getCount() + " féle termék, amelyekből minimum " + stats.getMin() + " db, maximum " + stats.getMax() + " db, összesen " + stats.getSum() + " db van.";
        }
        return "Nincs ilyen termék.";
    }
    public double getAveragePrice(){
        Stream<Product> objStream = productsList.stream();
        DoubleStream doubleStream = objStream.mapToDouble(s -> s.getPrice());
        return doubleStream.summaryStatistics().getAverage();
    }

    public int getNumberOfProducts(){
        Stream<Product> objStream = productsList.stream();
        IntStream intStream = objStream.mapToInt(s -> s.getAmount());
        return intStream.sum();
    }

    public List<Product> getProductsList() {
        return productsList;
    }


}
