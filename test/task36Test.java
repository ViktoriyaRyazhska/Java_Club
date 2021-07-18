import org.junit.jupiter.api.Test;
import org.w3c.dom.css.Counter;

import static org.junit.jupiter.api.Assertions.*;

class task36Test {

    @Test
    void testCountSheeps() {

        int expected = 5;

        int actual = new task36().countSheeps(new Boolean[] {true, true, false, true, false, false, true, true, false});

        assertEquals(expected, actual);

    }

}