package a002_KonzolKommunikacio_classstructureattributes;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Song favorite = new Song();

        System.out.println("Type in the name of the band which perform your favorite song:");
        favorite.band = scanner.nextLine();

        System.out.println("Type in the title of your favorite song:");
        favorite.title = scanner.nextLine();

        System.out.println("Type in the length in minutes of your favorite song:");
        favorite.length = scanner.nextInt();


        System.out.println("Based on the provided data your favorite song is the following:");
        System.out.print(favorite.band+" - "+favorite.title+" ("+favorite.length +" perc)");
    }
}
