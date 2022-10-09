package l01_IPCimek_nestedclasses.thermo;

import java.util.ArrayList;
import java.util.List;

public class Thermostat {
    private int temperatureLimit;
    private List<String> roomsToHeat;
    private List<ThermoMeter> thermoMeterList;

    public Thermostat() {
        temperatureLimit = 23;
        roomsToHeat =new ArrayList<>();
        thermoMeterList =new ArrayList<>();
    }

    public void addThermometer(ThermoMeter thermometer){
        thermometer.setThermometerObserver(new ThermometerObserver() {
            @Override
            public void handleTemperatureChange(int temp, String room) {
                if(temp<temperatureLimit){
                    roomsToHeat.add(room);
                }
                else{
                    roomsToHeat.remove(room);
                }
            }
        });
        thermoMeterList.add(thermometer);
    }

    public List<String> getRoomsToHeat() {
        return roomsToHeat;
    }
}
