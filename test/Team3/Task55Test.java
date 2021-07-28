package Team3;

import org.junit.Assert;
import org.junit.Test;

public class Task55Test {
    @Test
    public void replaceDots(){
        Assert.assertEquals("some text-test",Task55.replaceDots("some text.test"));
    }
}
