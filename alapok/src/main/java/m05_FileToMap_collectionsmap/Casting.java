package m05_FileToMap_collectionsmap;

import java.util.Map;

public class Casting {
    public String callNextApplicant(int lastNumber, Map<Integer, String> applicants){
        int next=Integer.MAX_VALUE;
        for(int ordinal:applicants.keySet()){
            if(ordinal>lastNumber){
                if(ordinal<next){
                    next=ordinal;
                }
            }
        }
        return applicants.get(next);
    }
}
