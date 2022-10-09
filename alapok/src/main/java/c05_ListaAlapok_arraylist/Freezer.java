package c05_ListaAlapok_arraylist;

import java.util.ArrayList;
import java.util.List;
public class Freezer {
    public static void main(String[] args) {
        List<String> itemList = new ArrayList<>();
        itemList.add("Chicken");
        itemList.add("Pizza");
        itemList.add("Icecream");
        itemList.add("Beer");
        itemList.add("T-bone");
        System.out.println(itemList.toString());
        System.out.println("Number of items in the freezer: "+itemList.size());
        System.out.println();

        itemList.remove("Beer");
        itemList.remove("Pizza");
        System.out.println(itemList.toString());
        System.out.println("Number of items in the freezer: "+itemList.size());

    }
}
