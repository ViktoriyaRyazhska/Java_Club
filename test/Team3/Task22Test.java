package Team3;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task22Test {

    @Test
    public void calculateAge() {
        String actual = Task22.calculateAge(2012,2015);
        String expected = "You are 3 years old.";
        assertEquals(actual,expected);
    }
    @Test
    public void calculateAge1() {
        String actual = Task22.calculateAge(2014,2015);
        String expected = "You are 1 year old.";
        assertEquals(actual,expected);
    }
    @Test
    public void calculateAge2() {
        String actual = Task22.calculateAge(2012,2012);
        String expected = "You were born this very year!";
        assertEquals(actual,expected);
    }
    @Test
    public void calculateAge3() {
        String actual = Task22.calculateAge(2012,2011);
        String expected = "You will be born in 1 year.";
        assertEquals(actual,expected);
    }
    @Test
    public void calculateAge4() {
        String actual = Task22.calculateAge(2012,2008);
        String expected = "You will be born in 4 years.";
        assertEquals(actual,expected);
    }

}