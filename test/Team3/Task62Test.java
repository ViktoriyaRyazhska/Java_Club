package Team3;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task62Test {

    @Test
    public void weatherInfo() {
        String actual = Task62.weatherInfo(50);
        String expected = "10.0 is above freezing temperature";
        assertEquals(actual,expected);
    }

    @Test
    public void convertToCelsius() {
       double actual = Task62.convertToCelsius(50);
       double expected = 10.0;
       double delta = 0.0001;
       assertEquals(actual,expected,delta);
    }
}