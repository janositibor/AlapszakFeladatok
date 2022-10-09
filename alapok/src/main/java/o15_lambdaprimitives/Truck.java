package o15_lambdaprimitives;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Truck {
    private List<Cargo> thingsToLoad;

    public Truck(List<Cargo> thingsToLoad) {
        this.thingsToLoad = thingsToLoad;
    }

    public String getWeightStatistics() {
        Stream<Cargo> objStream = thingsToLoad.stream();
        IntStream intStream = objStream.mapToInt(s -> s.getWeight());
        IntSummaryStatistics stats = intStream.summaryStatistics();
        if (stats.getCount() > 0) {
            return "A rakományban található " + stats.getCount() + " tétel, melyeknek összsúlya " +stats.getSum()+" kg, közülük a legnehezebb "+stats.getMax()+" kg, a legkönnyebb "+ stats.getMin() + " kg. A súlyuk átlagosan " + stats.getAverage() + " kg.";
        }
        return "No cargo.";
    }

    public int getMaxWeight(){
        Stream<Cargo> objStream = thingsToLoad.stream();
        IntStream intStream = objStream.mapToInt(s -> s.getWeight());
        IntSummaryStatistics stats = intStream.summaryStatistics();
        return stats.getCount() == 0?0: stats.getMax();
    }

    public double getAverageWeight(){
        Stream<Cargo> objStream = thingsToLoad.stream();
        IntStream intStream = objStream.mapToInt(s -> s.getWeight());
        IntSummaryStatistics stats = intStream.summaryStatistics();
        if (stats.getCount() == 0) {
            throw new IllegalArgumentException("No cargo.");
        }
        return stats.getAverage();
    }

    public double getShortestLength(){
        Stream<Cargo> objStream = thingsToLoad.stream();
        DoubleStream doubleStream = objStream.mapToDouble(s -> s.getLength());
        OptionalDouble min=doubleStream.min();

        return min.orElse(0.0);
    }

    public int getTotalWeight(){
        Stream<Cargo> objStream = thingsToLoad.stream();
        IntStream intStream = objStream.mapToInt(s -> s.getWeight());

        return intStream.sum();
    }

    public List<Cargo> getThingsToLoad() {
        return thingsToLoad;
    }
}
