package Team3;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task54Test {

    @Test
    public void opposite() {
        int actual = Task54.opposite(0);
        int expected = 0;
        assertEquals(actual,expected);
    }
    @Test
    public void opposite1() {
        int actual = Task54.opposite(-1);
        int expected = 1;
        assertEquals(actual,expected);
    }
    @Test
    public void opposite2() {
        int actual = Task54.opposite(1);
        int expected = -1;
        assertEquals(actual,expected);
    }
}