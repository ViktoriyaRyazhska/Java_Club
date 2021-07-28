package Team3;

import org.junit.Assert;
import org.junit.Test;

public class Task59Test {
    @Test
    public void position(){
        Assert.assertEquals("Position of alphabet: 1",Task59.position('A'));
        Assert.assertEquals("Position of alphabet: 1",Task59.position('a'));
        Assert.assertEquals("Position of alphabet: 3",Task59.position('C'));
    }
}
