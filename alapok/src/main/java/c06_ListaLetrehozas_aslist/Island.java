package c06_ListaLetrehozas_aslist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Island {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> importantThings=new ArrayList<>();

        System.out.println("Type in your first favorite thing for the island:");
        String favThing=scanner.nextLine();
        importantThings.add(favThing);

        System.out.println("Type in your second favorite thing for the island:");
        favThing=scanner.nextLine();
        importantThings.add(favThing);

        System.out.println("Type in your third favorite thing for the island:");
        favThing=scanner.nextLine();
        importantThings.add(favThing);

        System.out.println();
        System.out.println(importantThings);

        System.out.println();
        System.out.println("Which one should be replaced (1,2,3):");
        int remove=scanner.nextInt();
        scanner.nextLine(); // Dummy for the new line characters
        System.out.println("Type in the new favorite thing for the island:");
        favThing=scanner.nextLine();
        importantThings.remove(remove-1);
        importantThings.add(favThing);

        System.out.println();
        System.out.println(importantThings);

    }
}
