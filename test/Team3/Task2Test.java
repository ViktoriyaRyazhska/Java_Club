package Team3;

import org.junit.Assert;
import org.junit.Test;

public class Task2Test {
    @Test
    public void mulOfTwoNumbers() {
        double actual = Task2.mulOfTwoNumbers(3.0,6.0);
        double expected = 18;
        double delta = 0.00001;
        Assert.assertEquals(expected,actual,delta);
    }
    @Test
    public void mulOfTwoNumbersWithZero() {
        double actual = Task2.mulOfTwoNumbers(0.0,0.0);
        double expected = 0;
        double delta = 1e-9;
        Assert.assertEquals(expected,actual,delta);
    }
}
