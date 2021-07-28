package Team3;

import org.junit.Assert;
import org.junit.Test;

public class Task43Test {
    @Test
    public void nearestSq(){
        Assert.assertEquals(4,Task43.nearestSq(3));
        Assert.assertEquals(9,Task43.nearestSq(7));
    }
}
