package Team3;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task58Test {

    @Test
    public void tripleTrouble() {
        String actual = Task58.tripleTrouble("","","");
        String expected = "";
        assertEquals(actual,expected);
    }
    @Test
    public void tripleTrouble1() {
        String actual = Task58.tripleTrouble("Bm","aa","tn");
        String expected = "Batman";
        assertEquals(actual,expected);
    }

}