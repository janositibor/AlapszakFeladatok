package n03_Kereses_searching;

public class Book implements Comparable<Book>{
    private int id;
    private String title;
    private String author;

    public Book(String author, String title) {
        this.id=0;
        this.title = title;
        this.author = author;
    }

    public Book(int id, String author, String title) {
        this.id = id;
        this.title = title;
        this.author = author;
    }
    public int compareTo(Book o){
        if(this.author.equals(o.getAuthor())){
            return this.title.compareTo(o.getTitle());
        }
        return this.author.compareTo(o.getAuthor());
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return id + " " + author + " " + title;
    }
}
