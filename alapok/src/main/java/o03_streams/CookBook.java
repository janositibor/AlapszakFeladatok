package o03_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CookBook {
    private List<Cake> cakesList=new ArrayList<>();

    public CookBook(List<Cake> cakesList) {
        this.cakesList = cakesList;
    }

    List<String> listCakeNamesWithGivenIngredient(String ingredient){
        List<String> output=cakesList.stream()
                .filter(cake -> cake.needThatIngredient(ingredient))
//                .map(cake -> cake.getName())
                .map(Cake::getName)
                .collect(Collectors.toList());
        return output;
    }

    List<String> listCakeNamesWithMaxIngredients(int max){
        List<String> output=cakesList.stream()
                .filter(cake -> cake.getIngredients().size()<=max)
//                .map(cake -> cake.getName())
                .map(Cake::getName)
                .collect(Collectors.toList());
        return output;
    }
}
