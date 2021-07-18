package Team3;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Task7Test {

    @Test
    public void past() {
        int actual = Task7.past(2,15,45);
        int expected = 8145000;
        int delta = 0;
        Assert.assertEquals(expected,actual,delta);
    }

}