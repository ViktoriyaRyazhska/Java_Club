package Team3;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task42Test {

    @Test
    public void twiceAsOld() {
        int actual = Task42.TwiceAsOld(15,0);
        int expected = 15;
        assertEquals(actual,expected);
    }
    @Test
    public void twiceAsOld1() {
        int actual = Task42.TwiceAsOld(40,20);
        int expected = 0;
        assertEquals(actual,expected);
    }
    @Test
    public void twiceAsOld2() {
        int actual = Task42.TwiceAsOld(45,30);
        int expected = 15;
        assertEquals(actual,expected);
    }
}