package Team3;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task26Test {

    @Test
    public void boolToWord() {
        String actual = Task26.boolToWord(true);
        String expected = "Yes";
        assertEquals(actual,expected);
    }
    @Test
    public void boolToWord1() {
        String actual = Task26.boolToWord(false);
        String expected = "No";
        assertEquals(actual,expected);
    }
}