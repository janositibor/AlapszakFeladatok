package j07_STATICMethodsInterface_interfacestaticmethods.vehicle;

public interface Vehicle {
    static Vehicle of(int numberOfWheels){
        if(numberOfWheels==2 || numberOfWheels==4){
            if(numberOfWheels==2){
                return new Bicycle(numberOfWheels);
            }
            else{
                return new Car(numberOfWheels);
            }
        }
        else{
            throw new IllegalArgumentException("This is neither a bicycle nor a car.");
        }
    }
}
