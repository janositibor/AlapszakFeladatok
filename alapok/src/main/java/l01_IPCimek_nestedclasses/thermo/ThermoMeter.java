package l01_IPCimek_nestedclasses.thermo;

public class ThermoMeter {
    private String name;
    private int temperature;
    private ThermometerObserver observer;

    public ThermoMeter(String name, int temperature) {
        this.name = name;
        this.temperature = temperature;
        observer=null;
    }

    public void setThermometerObserver(ThermometerObserver observer){
        this.observer=observer;
        onTemperatureChanged();
    }

    private void onTemperatureChanged(){
        if(observer!=null){
            observer.handleTemperatureChange(temperature,name);
        }
    }


    public void setTemperature(int temperature){
        this.temperature=temperature;
        onTemperatureChanged();
    }

    public String getName() {
        return name;
    }

    public int getTemperature() {
        return temperature;
    }

    public ThermometerObserver getObserver() {
        return observer;
    }
}
