package Team3;

import org.junit.Assert;
import org.junit.Test;

public class Task51Test {
    @Test
    public void numberToString(){
        Assert.assertEquals("4",Task51.numberToString(4));
        Assert.assertEquals("0",Task51.numberToString(0));
    }
}
