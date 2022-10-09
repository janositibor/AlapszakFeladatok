package o16_lambdacollectors.christmastree;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ChristmasTreeFair {
    private List<ChristmasTree> treesToSell;

    public ChristmasTreeFair(List<ChristmasTree> treesToSell) {
        this.treesToSell = treesToSell;
    }

    public double getAveragePrice(){
        double avg = treesToSell.stream()
                .map(tree->tree.getType().getPricePerMeter())
                .collect(Collectors.averagingInt(x -> x.intValue()));

        return avg;
    }

    public double getMaxHeightByType(PineTreeType type){
        Stream<ChristmasTree> stream = treesToSell.stream()
                .filter(tree -> tree.getType()==type);
        Optional<ChristmasTree> maxHeight=stream.collect(Collectors.maxBy(Comparator.comparing(ChristmasTree::getHeight)));
        if(maxHeight.isPresent()){
            return maxHeight.get().getHeight();
        }
        return 0.0;
    }

    public Map<PineTreeType, Long> getCountByType(){
        Stream<ChristmasTree> stream = treesToSell.stream();
        Map<PineTreeType, Long> map =stream.collect(Collectors.groupingBy(ChristmasTree::getType,Collectors.counting()));
        return map;
    }
    public List<ChristmasTree> getTreesToSell() {
        return treesToSell;
    }
}
