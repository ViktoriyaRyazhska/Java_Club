import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task46Test {

    @Test
    void makeMove() {
      int expected = 3;
        int actual = task46.makeMove(3);
        assertEquals(expected,actual);
    }
}