package Team3;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task34Test {

    @Test
    public void getAverage() {
        int actual = Task34.getAverage(new int[]{23,4,1});
        int expected = 9;
        assertEquals(actual,expected);
    }
    @Test
    public void getAverage1() {
        int actual = Task34.getAverage(new int[]{0,0,0,0});
        int expected = 0;
        assertEquals(actual,expected);
    }
    @Test
    public void getAverage2() {
        int actual = Task34.getAverage(new int[]{4,4});
        int expected = 4;
        assertEquals(actual,expected);
    }
}