package o10_lambdaintro;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RealEstateAgency {
    List<Flat> flatsList=new ArrayList<>();

    public RealEstateAgency(List<Flat> flatsList) {
        this.flatsList = flatsList;
    }

    public Flat findFirstCheaperFlat(int minPrice){
        return findFirst(flat -> flat.getPrice()<minPrice);
    }
    public Flat findFirstGreaterFlat(double maxArea){
        return findFirst(flat -> flat.getArea()>maxArea);
    }
    public Flat findFirstFlatInSameTown(String town){
        return findFirst(flat -> flat.getAddress().contains(town));
    }
    private Flat findFirst(Predicate<Flat> condition){
        for(Flat flat:flatsList){
            if(condition.test(flat)){
                return flat;
            }
        }
        throw new IllegalArgumentException("No such flat.");
    }
}
