import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task26Test {

    @Test
    void boolToWord() {
       String expected = "Yes";
        String actual = task26.boolToWord(true);
        assertEquals(expected,actual);

        String expected2 = "No";
        String actual2 = task26.boolToWord(false);
        assertEquals(expected2,actual2);

    }
}