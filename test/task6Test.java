import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task6Test {

    @Test
    void toBinary() {
    int expected = 1;
    int actual = task6.toBinary(1);
    assertEquals(expected,actual);
    }
}