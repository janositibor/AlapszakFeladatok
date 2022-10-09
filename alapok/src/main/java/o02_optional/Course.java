package o02_optional;

public class Course {
    private String name;
    private int price;
    private Level level;

    public Course(String name, Level level, int price) {
        this.name = name;
        this.price = price;
        this.level = level;
    }

    public boolean isCheaperOrEqualThan(int maxPrice){
        return (price<=maxPrice);
    }

    public boolean matchLevel(Level level){
        return(this.level==level);
    }

    public boolean matchNameAndLevel(String name, Level level){
        return(this.name.equals(name) && matchLevel(level));
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Level getLevel() {
        return level;
    }
}
