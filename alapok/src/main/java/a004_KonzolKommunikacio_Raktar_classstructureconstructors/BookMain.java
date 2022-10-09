package a004_KonzolKommunikacio_Raktar_classstructureconstructors;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type in the book's author:");
        String author=scanner.nextLine();

        System.out.println("Type in the title of the book:");
        String title=scanner.nextLine();

        Book book = new Book(author, title);


        System.out.println("Type in the Registration Number for \""+book.getAuthor()+": "+book.getTitle()+"\":");
        book.register(scanner.nextLine());

        System.out.println("The book is registered with the following data:");
        System.out.println("Author: "+book.getAuthor());
        System.out.println("Title: "+book.getTitle());
        System.out.println("Registration Number: "+book.getRegNumber());
    }
}
