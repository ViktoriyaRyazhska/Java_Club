package com.team6.basic.tasks;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class Task6Test extends TestCase {

    @Test
    public void testRightConverted(){
        Assert.assertEquals("10",Task6.toBinary(2));
    }

    @Test
    public void testFallConverted(){
        Assert.assertNotEquals("111111",Task6.toBinary(100000));
    }

}