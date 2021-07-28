package Team3;

import org.junit.Assert;
import org.junit.Test;

public class Task11Test {
    @Test
    public void convertToCelsius(){
        Assert.assertEquals(148.8889,Task11.convertToCelsius(300),0.001);
    }
    @Test
    public void weatherInfo1(){
        Assert.assertEquals("76.66666666666667 is above freezing temperature",Task11.weatherInfo(170));
    }
    @Test
    public void weatherInfo2(){
        Assert.assertEquals("4.444444444444445 is above freezing temperature",Task11.weatherInfo(40));
    }
    @Test
    public void weatherInfo3(){
        Assert.assertEquals( "0.0 is freezing temperature",Task11.weatherInfo(32));
    }
}
