package e04_EnumBolygokHoldak_Pozicio_enumtype.firstenum;

import java.util.ArrayList;
import java.util.List;

public class FirstEnumMain {
    public static void main(String[] args) {
        List<String> continentList = new ArrayList<>();

        for(Continent continent:Continent.values()){
                System.out.println(continent);
            continentList.add(continent.name());
            }
        System.out.println(continentList);
        System.out.println();

        for(Ocean ocean:Ocean.values()){
            System.out.println(ocean.valueOf(ocean.name()));
        }
        System.out.println();

        for(Football football:Football.values()){
            System.out.println(football.name());
        }
    }
}
