package o02_optional;

public class Destination {
    private String name;
    private String description;
    private int kmFromHome;

    public Destination(String name, String description, int kmFromHome) {
        this.name = name;
        this.description = description;
        this.kmFromHome = kmFromHome;
    }

    public boolean isNearerThan(int maxKm){
        return (kmFromHome<maxKm);
    }

    public boolean match(String keyword){
        return (name.contains(keyword) || description.contains(keyword));
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getKmFromHome() {
        return kmFromHome;
    }
}
