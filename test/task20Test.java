import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task20Test {

    @Test
    void convert() {
        String expected = "true";
        String convert = task20.convert(true);
        assertEquals(expected,convert);
    }
}