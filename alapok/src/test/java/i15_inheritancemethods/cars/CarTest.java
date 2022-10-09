package i15_inheritancemethods.cars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void testIncorrectParameterShouldThrowException() throws IllegalArgumentException {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Car(5.0, 50.0, 40.0));
        assertTrue(ex.getMessage().startsWith("The capacity of tank is not enough for this amount of fuel: "));
    }

    @Test
    void testModifyFuelAmount() {
        //Given
        Car car = new Car(5.0, 25.0, 40.0);
        //When
        car.modifyFuelAmount(-10.0);
        //Then
        assertEquals(15.0, car.getFuel());
    }

    @Test
    void testDrive() {
        //Given
        Car car = new Car(5.0, 25.0, 40.0);
        //When
        car.drive(100);
        //Then
        assertEquals(20.0, car.getFuel());
    }

    @Test
    void testNotEnoughFuelShouldThrowException() throws IllegalArgumentException {
        Car car = new Car(5.0, 25.0, 40.0);

        Exception ex = assertThrows(IllegalArgumentException.class, () -> car.drive(600));
        assertTrue(ex.getMessage().startsWith("We can't drive as far! ("));

    }

    @Test
    void testCalculateRefillAmount() {
        //Given
        Car car = new Car(5.0, 25.0, 40.0);
        //Then
        assertEquals(15.0, car.calculateRefillAmount());
    }
}