import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task18Test {

    @Test
    void opposite() {
        int expected = -1 ;
        int actual = task18.opposite(1) ;
        assertEquals(expected,actual);

    }
}