package Team3;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task18Test {

    @Test
    public void opposite() {
        int actual = Task18.opposite(0);
        int expected = 0;
        assertEquals(actual,expected);
    }
    @Test
    public void opposite1(){
        int actual = Task18.opposite(-4);
        int expected = 4;
        assertEquals(actual,expected);
    }
}