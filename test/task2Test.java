import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task2Test {

    @Test
    void multiply() {
        int expected = 4;
        int actual = task2.multiply(2,2);
        assertEquals(expected,actual);
    }
}