package o11_lambdaoptional;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Costumer {
    private List<Costume> costumesList;

    public Costumer(List<Costume> costumesList) {
        this.costumesList = costumesList;
    }

    Optional<Costume> findFirstCostumeWithKeyWord(String keyWord){
        return findFirst(costume-> costume.getDescription().contains(keyWord));
    }
Optional<Costume> findFirstCheaperCostume(int maxPrice){
        return findFirst(costume-> costume.getPrice()<maxPrice);
    }
Optional<Costume> findFirstCostumeSameSize(Size size){
        return findFirst(costume-> costume.getSize()==size);
    }

    private Optional<Costume> findFirst(Predicate<Costume> condition){
        for(Costume costume:costumesList){
            if(condition.test(costume)){
                return Optional.of(costume);
            }
        }
        return Optional.empty();
    }
}
