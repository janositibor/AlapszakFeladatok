package o13_lambdastreams.bookstore;

public class Book implements Comparable<Book>{
    private String title;
    private int year;
    private int price;
    private int amount;

    public Book(String title, int year, int price, int amount) {
        this.title = title;
        this.year = year;
        this.price = price;
        this.amount = amount;
    }
    public int getTotalValue() {
        return amount*price;
    }


    @Override
    public int compareTo(Book o) {
        return o.year-year;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublish() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }
}
