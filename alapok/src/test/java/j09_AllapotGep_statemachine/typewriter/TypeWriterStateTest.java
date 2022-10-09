package j09_AllapotGep_statemachine.typewriter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TypeWriterStateTest {
    @Test
    void testNext() {
        assertEquals(TypeWriterState.CAPSLOCKON, TypeWriterState.CAPSLOCKOFF.next());
        assertEquals(TypeWriterState.CAPSLOCKOFF, TypeWriterState.CAPSLOCKON.next());
    }
}