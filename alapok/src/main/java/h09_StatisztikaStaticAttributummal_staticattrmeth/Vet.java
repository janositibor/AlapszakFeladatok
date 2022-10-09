package h09_StatisztikaStaticAttributummal_staticattrmeth;

import java.util.ArrayList;
import java.util.List;

public class Vet {
    private List<Dog> dogs=new ArrayList<>();
    public static long code=1;



    public List<Dog> getDogs() {
        return dogs;
    }
    public void addDog(Dog dog){
        dog.setCodeNumber(code);
        code++;
        dogs.add(dog);
    }
}
