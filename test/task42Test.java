import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task42Test {

    @Test
    void twiceAsOld() {
        int expected = 30;
        int actual = task42.TwiceAsOld(30, 0);
        assertEquals(expected,actual);

        int expected1 = 16;
        int actual1 = task42.TwiceAsOld(30, 7);
        assertEquals(expected1,actual1);
    }
}