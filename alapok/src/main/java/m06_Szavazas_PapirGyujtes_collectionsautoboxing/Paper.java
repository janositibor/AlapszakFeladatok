package m06_Szavazas_PapirGyujtes_collectionsautoboxing;

import java.util.HashMap;
import java.util.Map;

public class Paper {
    Map<String, Integer> collectedPaper=new HashMap<>();

    public void putFurtherPaper(String className, int kilogramms){
        if(collectedPaper.containsKey(className)){
            kilogramms+=collectedPaper.get(className);
        }
        collectedPaper.put(className,kilogramms);
    }

    public String getWinnerClass(){
        String winnerClassName="";
        int maxWeight=0;
        for(Map.Entry<String, Integer> mapEntry:collectedPaper.entrySet()){
            if(mapEntry.getValue()>maxWeight){
                maxWeight=mapEntry.getValue();
                winnerClassName= mapEntry.getKey();
            }
        }
        return winnerClassName;
    }

    public int getTotalWeight(){
        int totalWeight=0;
        for(int weight:collectedPaper.values()){
            totalWeight+=weight;
        }
        return totalWeight;
    }
    public Map<String, Integer> getPaper() {
        return collectedPaper;
    }

}
