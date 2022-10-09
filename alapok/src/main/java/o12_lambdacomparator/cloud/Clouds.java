package o12_lambdacomparator.cloud;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Clouds {
    public String reportList(List<CloudStorage> storageList){
        String output="";
        CloudStorage cloudStorage;
        for(int i=0; i<storageList.size();i++){
            cloudStorage=storageList.get(i);
            output+=cloudStorage;
        }
        return output;
    }

    public CloudStorage alphabeticallyFirst(List<CloudStorage> storageList){
        if(storageList==null){
            throw new IllegalArgumentException("StorageList mustn't be null!");
        }
        List<CloudStorage> newList=new ArrayList<>(storageList);
        newList.sort(Comparator.comparing(CloudStorage::getProvider, (s, t) -> s.trim().toLowerCase().compareTo(t.trim().toLowerCase())));
        return newList.get(0);
    }
    public CloudStorage bestPriceForShortestPeriod(List<CloudStorage> storageList){
        if(storageList==null){
            throw new IllegalArgumentException("StorageList mustn't be null!");
        }
        List<CloudStorage> newList=new ArrayList<>(storageList);
        newList.sort(Comparator.comparing(CloudStorage::getLength).thenComparing(CloudStorage::getPrice));
        return newList.get(0);
    }
    public List<CloudStorage> worstOffers(List<CloudStorage> storageList){
        if(storageList==null){
            throw new IllegalArgumentException("StorageList mustn't be null!");
        }
        List<CloudStorage> newList=new ArrayList<>(storageList);
        newList.sort(Comparator.reverseOrder());
        if(newList.size()>=3) {
            return newList.subList(0, 3);
        }
        return newList.subList(0, newList.size());
    }

}
