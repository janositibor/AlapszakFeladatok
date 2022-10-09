package i13_Ososztaly_objectclass.ancestor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonAncestor {
    public static void main(String[] args) {
        List<Object> objectsList=new ArrayList<>();
        objectsList.add(new Fruit());
        objectsList.add(new Apple());
        objectsList.add(new Starking());
        objectsList.add(new Vegetable());
        objectsList.add("alma");
        objectsList.add(12);
        objectsList.add('x');
        objectsList.add(LocalDate.now());
        objectsList.add(new int[]{1,3,2,75,13});
        objectsList.add(new Vegetable());
        objectsList.add(new ArrayList<>(Arrays.asList("fehér", "kék", "piros","sárga")));

        System.out.println(objectsList);
    }
}