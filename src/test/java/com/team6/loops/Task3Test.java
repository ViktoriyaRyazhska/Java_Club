package com.team6.loops;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class Task3Test extends TestCase {

    @Test
    public void testGetAverageValueTrue(){
        Assert.assertEquals(10,Task3.getAverage(new int[]{0,10,20}));
    }

    @Test
    public void testGetAverageValueFall(){
        Assert.assertNotEquals(60,Task3.getAverage(new int[]{0,10,100,4020}));
    }

    @Test (expected = ArithmeticException.class)
    public void testGetAverageValueByZero(){
        Task3.getAverage(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0});
    }


}