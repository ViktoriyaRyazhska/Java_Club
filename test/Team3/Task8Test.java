package Team3;

import org.junit.Assert;
import org.junit.Test;

public class Task8Test {
    @Test
    public void century1(){
        Assert.assertEquals(21,Task8.century(2000));
    }
    @Test
    public void century2(){
        Assert.assertEquals(1,Task8.century(0));
    }
    @Test
    public void century3(){
        Assert.assertEquals(5,Task8.century(430));
    }
    @Test
    public void century4(){
        Assert.assertEquals(21,Task8.century(2099));
    }
}
