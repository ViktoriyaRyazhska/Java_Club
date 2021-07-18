import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task54Test {

    @Test
    void opposite() {
        int expected = -1;
        int actual = task54.opposite(1);

        assertEquals(expected,actual);

    }
}