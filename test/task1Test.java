import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task1Test {

    @Test
    void doubleInteger() {
        
        int expected = 4;
        int actual = task1.doubleInteger(2);

        assertEquals(expected, actual);
    }

}