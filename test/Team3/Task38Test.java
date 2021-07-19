package Team3;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task38Test {

    @Test
    public void betterThanAverage() {
        boolean actual = Task38.betterThanAverage(new int[]{1,2,3,4},4);
        boolean expected = true;
        assertEquals(actual,expected);
    }
    @Test
    public void betterThanAverage1() {
        boolean actual = Task38.betterThanAverage(new int[]{4,5,4,4},4);
        boolean expected = false;
        assertEquals(actual,expected);
    }
}