package Team3;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task10Test {

    @Test
    public void datingRange() {
        String actual = Task10.datingRange(10);
        String expected = "9-11";
        assertEquals(actual,expected);
    }
    @Test
    public void datingRange1(){
        String actual = Task10.datingRange(40);
        String expected = "27-66";
        assertEquals(actual,expected);
    }
}