package d07_KompozicioListaval_Computer_compositionlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Books {
    private List<String> bookTitleList = new ArrayList<>();

    public void addBook(String title){
        bookTitleList.add(title);
    }
    public void findBookAndSetAuthor(String title, String author){
        int foundIndex=bookTitleList.indexOf(title);
        if(foundIndex>-1){
            String newTitle= author+": "+bookTitleList.get(foundIndex);
            bookTitleList.set(foundIndex,newTitle);
        }
    }

    @Override
    public String toString() {
        return "Books{" +
                "BookTitleList=" + bookTitleList +
                '}';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Books books=new Books();
        System.out.println("Type in the number of books:");
        int bookNumber=scanner.nextInt();
        scanner.nextLine(); // Dummy for the new line characters
        for(int i=0; i<bookNumber;i++){
            System.out.println("Type in the title of book:");
            books.addBook(scanner.nextLine());
        }
        System.out.println(books);

        System.out.println();
        System.out.println("Type in the title of the book for search:");
        String title=scanner.nextLine();
        System.out.println("Type in the author of this book:");
        String author=scanner.nextLine();
        books.findBookAndSetAuthor(title,author);
        System.out.println(books);

    }
}
