package o13_lambdastreams.bookstorev2;

import java.util.List;
import java.util.Optional;

public class BookStore {
    private List<Book> booksList;

    public BookStore(List<Book> booksList) {
        this.booksList = booksList;
    }

    public Integer getNumberOfBooks(){
        int output=booksList.stream()
                 .reduce(0,(i,b) -> i+b.getAmount(), (i,j) -> i+j);
        return Integer.valueOf(output);
    }

    public Optional<Book> findNewestBook(){
        return booksList.stream()
                .sorted()
                .findFirst();
    }

    public Integer getTotalValue(){
        int output=booksList.stream()
                .reduce(0,(i,b) -> i+b.getTotalValue(), (i,j) -> i+j);
        return Integer.valueOf(output);
    }
}
