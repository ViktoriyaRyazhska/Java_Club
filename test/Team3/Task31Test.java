package Team3;

import org.junit.Assert;
import org.junit.Test;

public class Task31Test {
    @Test
    public void rentalCarCost1(){
        Assert.assertEquals(140,Task31.rentalCarCost(4));
        Assert.assertEquals(430,Task31.rentalCarCost(12));
        Assert.assertEquals(0,Task31.rentalCarCost(0));
        Assert.assertEquals(0,Task31.rentalCarCost(-5));
    }
}
