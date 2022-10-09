package l01_IPCimek_nestedclasses.thermo;

public interface ThermometerObserver {
    void handleTemperatureChange(int temp, String room);
}
