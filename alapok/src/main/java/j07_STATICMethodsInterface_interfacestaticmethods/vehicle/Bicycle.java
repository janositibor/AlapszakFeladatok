package j07_STATICMethodsInterface_interfacestaticmethods.vehicle;

public class Bicycle implements Vehicle{
    private int numberOfWheels;

    public Bicycle(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
}
