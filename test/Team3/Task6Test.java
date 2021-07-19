package Team3;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task6Test {

    @Test
    public void toBinary() {
        int actual = Task6.toBinary(5);
        int expected = 101;
        assertEquals(actual,expected);
    }
    @Test
    public void toBinary1(){
        int actual = Task6.toBinary(10);
        int expected = 1010;
        assertEquals(actual,expected);
    }
}