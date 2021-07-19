package Team3;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Task70Test {

    @Test
    public void createList() {
        List actual = Task70.CreateList(0);
        List expected = Arrays.asList();
        assertEquals(actual,expected);
    }
    @Test
    public void createList1() {
        List actual = Task70.CreateList(10);
        List expected = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        assertEquals(actual,expected);
    }
}