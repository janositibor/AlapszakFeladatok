package o13_lambdastreams.bookstore;

import java.util.List;
import java.util.Optional;

public class BookStore {
    private List<Book> booksList;

    public BookStore(List<Book> booksList) {
        this.booksList = booksList;
    }

    public Integer getNumberOfBooks(){
        long output=booksList.stream()
                .map(Book::getAmount)
                .mapToInt(Integer::intValue)
                .sum();
        return Integer.valueOf((int) output);
    }

    public Optional<Book> findNewestBook(){
        return booksList.stream()
                .sorted()
                .findFirst();
    }

    public Integer getTotalValue(){
        long output=booksList.stream()
                .map(Book::getTotalValue)
                .mapToInt(Integer::intValue)
                .sum();
        return Integer.valueOf((int) output);
    }
}