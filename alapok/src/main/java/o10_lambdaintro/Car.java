package o10_lambdaintro;

public class Car {
    private String brand;
    private String type;
    private int price;
    private double lengthInMeter;

    public Car(String brand, String type, int price, double lengthInMeter) {
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.lengthInMeter = lengthInMeter;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public double getLength() {
        return lengthInMeter;
    }
}
