import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task7Test {

    @Test
    void past() {
        int expected = 61000;
        int actual = task7.Past(0,1,1) ;
        assertEquals(expected,actual);
    }
}