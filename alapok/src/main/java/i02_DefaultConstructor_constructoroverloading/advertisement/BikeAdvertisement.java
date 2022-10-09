package i02_DefaultConstructor_constructoroverloading.advertisement;

import java.util.List;

public class BikeAdvertisement {
    private String description;
    private int price;
    private List<String> extras;
    private String brand;
    private String serial;

    public BikeAdvertisement(String description, int price) {
        this.description = description;
        this.price = price;
    }

    public BikeAdvertisement(String description, int price, String brand) {
        this(description, price);
        this.brand = brand;
    }

    public BikeAdvertisement(String description, int price, String brand, List<String> extras) {
        this(description, price, brand);
        this.extras = extras;
    }

    public BikeAdvertisement(String description, int price, String brand, List<String> extras, String serial) {
        this(description, price, brand, extras);
        this.serial = serial;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public List<String> getExtras() {
        return extras;
    }

    public String getBrand() {
        return brand;
    }

    public String getSerial() {
        return serial;
    }
}
