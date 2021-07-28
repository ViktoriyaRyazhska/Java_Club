package Team3;

import org.junit.Assert;
import org.junit.Test;

public class Task19Task {
    @Test
    public void isDivisible1(){
        Assert.assertEquals(true,Task19.isDivisible(10,5,2));
    }
    @Test
    public void isDivisible2(){
        Assert.assertEquals(false,Task19.isDivisible(5,2,3));
    }
    @Test
    public void isDivisible3(){
        Assert.assertEquals(false,Task19.isDivisible(5,0,3));
    }
    @Test
    public void isDivisible4(){
        Assert.assertEquals(false,Task19.isDivisible(0,0,0));
    }



}
