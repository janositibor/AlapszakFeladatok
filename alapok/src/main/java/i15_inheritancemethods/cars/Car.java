package i15_inheritancemethods.cars;

public class Car {
    private double fuelRate;
    private double fuel;
    private double tankCapacity;

    public Car(double fuelRate, double fuel, double tankCapacity) {
        if(fuel>tankCapacity){
            throw new IllegalArgumentException("The capacity of tank is not enough for this amount of fuel: "+fuel+" liter");
        }
        this.fuelRate = fuelRate;
        this.fuel = fuel;
        this.tankCapacity = tankCapacity;
    }

    public void modifyFuelAmount(double fuel){
        this.fuel+=fuel;
    }

    public void drive(int km) { // csökkenti az üzemanyag mennyiségét, nem fogyhat ki!
    if (!canDriveThisDistance(km)){
        throw new IllegalArgumentException("We can't drive as far! ("+km+" km)");
        }
        modifyFuelAmount(-1*km*fuelRate/100);
    }

    private boolean canDriveThisDistance(int km) {
        return 100*fuel/fuelRate>=km;
    }

    public double calculateRefillAmount() { //kiszámolja, mennyit lehet tankolni
        return tankCapacity-fuel;
    }

    public double getFuelRate() {
        return fuelRate;
    }

    public double getFuel() {
        return fuel;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
}
