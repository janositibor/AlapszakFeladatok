package o16_lambdacollectors.honey;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BeeKeeper {
    private List<Honey> honeyList;

    public BeeKeeper(List<Honey> honeyList) {
        this.honeyList = honeyList;
    }

    public void addHoney(Honey honey){
        honeyList.add(honey);
    }

    public Map<GlassSize, Long> getAmountsOfGivenType(HoneyType type){
        Stream<Honey> stream=honeyList.stream()
                .filter(honey->honey.getHoneyType()==type);
        Map<GlassSize, Long> map =stream.collect(Collectors.groupingBy(Honey::getGlassSize, Collectors.counting()));

        return map;
    }

    public Map<Boolean, List<Honey>> getGroupsByGivenTypeAndSize(HoneyType type, GlassSize size){
        Stream<Honey> stream=honeyList.stream();
        return stream.collect(Collectors.partitioningBy(honey -> (honey.getHoneyType() == type && honey.getGlassSize()==size)));

    }

    public int getTotalValueOfGivenGlasses(GlassSize size){
        Stream<Honey> stream=honeyList.stream()
                .filter(honey->honey.getGlassSize()==size);
        return stream.map(honey->honey.getHoneyType().getPriceOfKilogramm()*size.getWeight())
                .collect(Collectors.summingInt(x -> x.intValue()));

    }

    public List<Honey> getHoneyList() {
        return honeyList;
    }
}
