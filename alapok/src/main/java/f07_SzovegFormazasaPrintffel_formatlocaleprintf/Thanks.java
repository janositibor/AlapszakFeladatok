package f07_SzovegFormazasaPrintffel_formatlocaleprintf;

import java.util.ArrayList;
import java.util.List;

public class Thanks {
    public static void main(String[] args) {
        List<String> namesList = new ArrayList<>();
        namesList.add("Barna Gábor");
        namesList.add("Fehér Virág");
        namesList.add("Kék Nóra");
        namesList.add("Fekete Vendel");
        namesList.add("Csütörtök Róbert");
        String mondat;
        for(String name:namesList){
            mondat=String.format("Kedves %s! Örülünk, hogy termékünket választotta!",name);
            System.out.println(mondat);
        }
    }
}
