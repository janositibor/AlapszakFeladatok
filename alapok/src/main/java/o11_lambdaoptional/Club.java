package o11_lambdaoptional;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Club {
    private List<Member> membersList;

    public Club(List<Member> membersList) {
        this.membersList = membersList;
    }

    public Optional<Member> findFirst(Predicate<Member> predicate){
        for(Member member:membersList){
            if(predicate.test(member)){
                return Optional.of(member);
            }
        }
        return Optional.empty();
    }
    public Optional<Double> averageNumberOfSkills(){
        if(membersList.size()==0){
            return Optional.empty();
        }
        else{
            int totalSkillNumber=0;
            for(Member member:membersList){
                totalSkillNumber+=member.getSkills().size();
            }
            return Optional.of((double) (totalSkillNumber)/ membersList.size());
        }
    }
}
