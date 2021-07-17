package com.team6.basic.tasks;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class Task2Test {

    @Test
    public void testExecute() {
        Assert.assertEquals(16, Task2.multiply(4, 4));
    }

    @Test
    public void testExecute2(){
        Assert.assertEquals(1, Task2.multiply(3, 10));
    }

    @Test
    public void testExecute3(){
        Assert.assertEquals(Task2.multiply(4, 25), Task2.multiply(2, 50));
    }

    @Test
    public void testExecute4(){
        Assert.assertFalse(1 == Task2.multiply(0,0));
    }
}