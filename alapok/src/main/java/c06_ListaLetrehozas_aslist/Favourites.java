package c06_ListaLetrehozas_aslist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Favourites {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> favouriteThings = new ArrayList<>();

        System.out.println("Type in your favorite movie:");
        String favThing=scanner.nextLine();
        favouriteThings.add(favThing);

        System.out.println("Type in your favorite book:");
        favThing=scanner.nextLine();
        favouriteThings.add(favThing);

        System.out.println("Type in your favorite animal:");
        favThing=scanner.nextLine();
        favouriteThings.add(favThing);
        System.out.println("Thr size of the list is: "+favouriteThings.size());
        System.out.println(favouriteThings);
    }
}