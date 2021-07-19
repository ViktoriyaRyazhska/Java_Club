package Team3;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task30Test {

    @Test
    public void updateLight() {
        String actual = Task30.updateLight("red");
        String expected = "green";
        assertEquals(actual,expected);
    }
    @Test
    public void updateLight1() {
        String actual = Task30.updateLight("green");
        String expected = "yellow";
        assertEquals(actual,expected);
    }
    @Test
    public void updateLight2() {
        String actual = Task30.updateLight("yellow");
        String expected = "red";
        assertEquals(actual,expected);
    }
}