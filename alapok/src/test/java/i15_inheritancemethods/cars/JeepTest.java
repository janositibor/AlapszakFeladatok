package i15_inheritancemethods.cars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JeepTest {

    @Test
    void testIncorrectParameterShouldThrowException() throws IllegalArgumentException {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Jeep(10.0, 60.0, 50.0, 40.0, 20.0));
        assertTrue(ex.getMessage().startsWith("The capacity of tank is not enough for this amount of fuel: "));
    }
    @Test
    void testIncorrectParameterShouldThrowException_ExtraTank() throws IllegalArgumentException {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Jeep(10.0, 40.0, 50.0, 40.0, 50.0));
        assertTrue(ex.getMessage().startsWith("The capacity of extra tank is not enough for this amount of fuel: "));
    }

    @Test
    void testCalculateRefillAmount() {
        //Given
        Jeep jeep = new Jeep(10.0, 30.0, 50.0, 40.0, 20.0);
        //Then
        assertEquals(40.0, jeep.calculateRefillAmount());
    }

    @Test
    void testDrive() {
        //Given
        Jeep jeep = new Jeep(10.0, 30.0, 50.0, 40.0, 20.0);
        //When
        jeep.drive(300);
        //Then
        assertEquals(0.0, jeep.getExtraFuel());
        assertEquals(20.0, jeep.getFuel());
    }

    @Test
    void testNotEnoughFuelShouldThrowException() throws IllegalArgumentException {
        Jeep jeep = new Jeep(10.0, 30.0, 50.0, 40.0, 20.0);

        Exception ex = assertThrows(IllegalArgumentException.class, () -> jeep.drive(600));
        assertTrue(ex.getMessage().startsWith("We can't drive as far! ("));

    }
}