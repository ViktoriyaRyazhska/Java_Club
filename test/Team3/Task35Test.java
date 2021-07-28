package Team3;

import org.junit.Assert;
import org.junit.Test;

public class Task35Test {
    @Test
    public void map(){
        String arrayExpected = "[2, 4, 6, 8]";
        int [] arrayActual = new int[]{1,2,3,4};
        Assert.assertEquals(arrayExpected,Task35.map(arrayActual));

    }
}
