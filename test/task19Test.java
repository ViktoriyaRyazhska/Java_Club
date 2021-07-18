import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task19Test {

    @Test
    void isDivisible() {
        boolean expected = true;
        boolean actual = task19.isDivisible(12, 4, 3);
        assertEquals(true,actual);
    }
}