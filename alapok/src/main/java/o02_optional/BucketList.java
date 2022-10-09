package o02_optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BucketList {
    private List<Destination> destinationList=new ArrayList<>();

    public BucketList() {
    }

    public BucketList(List<Destination> destinationList) {
        this.destinationList = destinationList;
    }

    Optional<Destination> getDestinationNearerThanGiven(int maxKm){
        for(Destination destination:destinationList){
            if(destination.isNearerThan(maxKm)){
                return Optional.of(destination);
            }
        }
        return Optional.empty();
    }
    Optional<Destination> getDestinationWithKeyword(String keyword){
        for(Destination destination:destinationList){
            if(destination.match(keyword)){
                return Optional.of(destination);
            }
        }
        return Optional.empty();
    }

    public List<Destination> getDestinationList() {
        return destinationList;
    }

    public void addDestination(Destination destination) {
        if(destination==null){
            throw new IllegalArgumentException("Destination mustn't be empty!");
        }
        destinationList.add(destination);
    }
}
