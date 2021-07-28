package Team3;

import org.junit.Assert;
import org.junit.Test;

public class Task4Test {
    @Test
    public void isDivisible1(){

        Assert.assertEquals(true,Task4.isDivisible(4,2));
    }
    @Test
    public void isDivisible2(){

        Assert.assertEquals(false,Task4.isDivisible(4,3));
    }
    @Test
    public void isDivisible3(){

        Assert.assertEquals(true,Task4.isDivisible(0,0));
    }
    @Test
    public void isDivisible4(){

        Assert.assertEquals(true,Task4.isDivisible(4,0));
    }
}
