package o03_streams;

import java.util.List;

public class Cake {
    private String name;
    private List<String> ingredients;

    public Cake(String name, List<String> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    public boolean needThatIngredient(String ingredientToCheck){
        return ingredients.contains(ingredientToCheck);
    }

    public String getName() {
        return name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}
