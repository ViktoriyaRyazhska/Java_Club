package Team3;

import org.junit.Assert;
import org.junit.Test;

public class Task39Test {
    @Test
    public void grow(){
        Assert.assertEquals(24,Task39.grow(new int[]{1,2,3,4}));
        Assert.assertEquals(0,Task39.grow(new int[]{0,0,0,0}));
    }
}
