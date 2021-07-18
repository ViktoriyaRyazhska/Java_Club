import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task30Test {

    @Test
    void testToAlternativeEmptyString() {
    assertThrows(RuntimeException.class,
        () -> task30.updateLight("test"),
            "You put bad string");

    }

    @Test
    void updateLight() {
        String expected = "green";
        String actual = task30.updateLight("red");


        String expected2 = "yellow";
        String actual2 = task30.updateLight("green");

        assertEquals(expected, actual);
        assertEquals(expected2, actual2);

    }

}