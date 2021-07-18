import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task10Test {

    @Test
    void datingRange() {
        String expected = "9-11" ;
        String actual = task10.datingRange(10) ;
        assertEquals(expected,actual);
    }
}