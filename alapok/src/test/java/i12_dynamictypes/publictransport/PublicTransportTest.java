package i12_dynamictypes.publictransport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PublicTransportTest {

    @Test
    void testPublicVehicles() {
        PublicVehicle bus = new Bus(6, 12, "Ikarus");
        PublicVehicle tram = new Tram(1, 25, 3);
        PublicVehicle metro = new Metro(3, 33, 4);

        PublicTransport publicTransport = new PublicTransport();
        publicTransport.addVehicle(bus);
        publicTransport.addVehicle(tram);
        publicTransport.addVehicle(metro);

        assertEquals(3, publicTransport.getPublicVehicles().size());
    }
}