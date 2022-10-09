package i15_inheritancemethods.cars;

public class Jeep extends Car{
    private double extraCapacity;
    private double extraFuel;

    public Jeep(double fuelRate, double fuel, double tankCapacity, double extraCapacity, double extraFuel) {
        super(fuelRate, fuel, tankCapacity);
        if(extraFuel>extraCapacity){
            throw new IllegalArgumentException("The capacity of extra tank is not enough for this amount of fuel: "+extraFuel+" liter");
        }
        this.extraCapacity = extraCapacity;
        this.extraFuel = extraFuel;
    }

    @Override
    public void modifyFuelAmount(double fuel){
        if(fuel<0){
            decreaseFuelAmount(Math.abs(fuel));
        }
        else{
            increaseFuelAmount(fuel);
        }
    }

    private void increaseFuelAmount(double fuel) {
        if(fuel<getTankCapacity()-getFuel()){
            setFuel(getFuel()+fuel);
        }
        else{
            setFuel(getTankCapacity());
            extraFuel=fuel+getFuel()+extraFuel-getTankCapacity();
        }
    }

    private void decreaseFuelAmount(double fuel) {
        if(fuel<=extraFuel){
            extraFuel-=fuel;
        }
        else{
            setFuel(getFuel()-(fuel-extraFuel));
            extraFuel=0;
        }
    }

    private boolean canDriveThisDistance(int km) {
        return 100*(extraFuel+getFuel())/getFuelRate()>=km;
    }

    @Override
    public void drive(int km){ // csökkenti az üzemanyag mennyiségét, nem fogyhat ki!
        if (!canDriveThisDistance(km)){
            throw new IllegalArgumentException("We can't drive as far! ("+km+" km)");
        }
        modifyFuelAmount(-1*km*getFuelRate()/100);
    }

    @Override
    public double calculateRefillAmount() { //kiszámolja, mennyit lehet tankolni
    return(getTankCapacity()-getFuel()+extraCapacity-extraFuel);
    }

    public double getExtraCapacity() {
        return extraCapacity;
    }

    public double getExtraFuel() {
        return extraFuel;
    }
}
