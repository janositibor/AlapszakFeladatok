package l01_IPCimek_nestedclasses.thermo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThermoMeterTest {
    static class TestObserver implements ThermometerObserver {

        private int temperature;

        private String room;

        @Override
        public void handleTemperatureChange(int temp, String room) {
            this.temperature = temp;
            this.room = room;
        }

        public int getTemperature() {
            return temperature;
        }

        public String getRoom() {
            return room;
        }
    }

    @Test
    void testSetTemperature() {
        ThermoMeter thermometer = new ThermoMeter("room1", 25);
        TestObserver observer = new TestObserver();
        thermometer.setThermometerObserver(observer);
        thermometer.setTemperature(22);

        assertEquals("room1", observer.getRoom());
        assertEquals(22, observer.getTemperature());
    }
}