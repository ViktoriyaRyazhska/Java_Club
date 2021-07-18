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
     String expected = "Green";
        String actual = task30.updateLight("Red");


        String expected2 = "Yellow";
        String actual2 = task30.updateLight("Green");

       







    }

}