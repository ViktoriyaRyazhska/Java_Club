import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task34Test {

    @Test
    void getAverage() {
        int expected = 3 ;
        int actual = task34.getAverage(new int[]{1, 2, 3, 4, 5});
        assertEquals(expected,actual);
    }
}