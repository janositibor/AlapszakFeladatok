package j09_AllapotGep_statemachine.seatheater;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SeatHeaterStateTest {

    @Test
    void testNext() {
        assertEquals(SeatHeaterState.HOT, SeatHeaterState.OFF.next());
        assertEquals(SeatHeaterState.WARM, SeatHeaterState.HOT.next());
        assertEquals(SeatHeaterState.TEPID, SeatHeaterState.WARM.next());
        assertEquals(SeatHeaterState.OFF, SeatHeaterState.TEPID.next());
    }
}