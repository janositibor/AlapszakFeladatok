package n01_Iterator_collectionsiterator;

public class ChristmasPresent {
    private String name;
    private String description;
    private int price;

    public ChristmasPresent(String description, String name, int price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getNameOfPerson() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }
}
