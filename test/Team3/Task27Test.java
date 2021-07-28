package Team3;

import org.junit.Assert;
import org.junit.Test;

public class Task27Test {

    @Test
    public void enough1(){
        Assert.assertEquals("He can't fit 4 of the 14 waiting",Task27.enough(25,15,14));
    }
    @Test
    public void enough2(){
        Assert.assertEquals("He can fit all 4 passengers",Task27.enough(25,5,4));
    }
}
