package m06_Szavazas_PapirGyujtes_collectionsautoboxing;

import java.util.HashMap;
import java.util.Map;

public class Vote {
    public Map<VoteResult, Integer> getResult(Map<String, VoteResult> votesByPeople){
        Map<VoteResult, Integer> voteResult=new HashMap<>();
        voteResult.put(VoteResult.YES,0);
        voteResult.put(VoteResult.NO,0);
        voteResult.put(VoteResult.ABSTAIN,0);
        for(String person:votesByPeople.keySet()){
            VoteResult vote=votesByPeople.get(person);
            voteResult.put(vote,voteResult.get(vote)+1);
        }
        return voteResult;
    }
}
