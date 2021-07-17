package com.team6.basic.tasks;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class Task2Test {

    @Test
    public void testMultiplyTrue() {
        Assert.assertEquals(16, Task2.multiply(4, 4));
    }

    @Test
    public void testMultiplyFall(){
        Assert.assertNotEquals(1, Task2.multiply(3, 10));
    }
}