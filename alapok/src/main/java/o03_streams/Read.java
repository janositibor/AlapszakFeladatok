package o03_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Read {
    private List<Book> booksList=new ArrayList<>();

    public Read(List<Book> booksList) {
        this.booksList = booksList;
    }

    public Read() {
    }
    public void addBook(Book book){
        booksList.add(book);
    }

    public List<String> listAuthors(){
        List<String> output=booksList.stream()
                .map(book -> book.getAuthor())
                .distinct()
                .collect(Collectors.toList());
        return output;
    }

    public List<String> listBookTitlesWithGivenAuthor(String author){
        List<String> output=booksList.stream()
                .filter(book -> book.getAuthor().equals(author))
                .map(book -> book.getTitle())
                .sorted()
                .collect(Collectors.toList());
        return output;
    }

    public List<String> listBookTitlesShorterThanGiven(int maxNumberOfPages){
        List<String> output=booksList.stream()
                .filter(book -> book.getPages() < maxNumberOfPages)
                .map(book -> book.getTitle())
                .collect(Collectors.toList());
        return output;
    }

    public List<Book> getBooksList() {
        return booksList;
    }
}
