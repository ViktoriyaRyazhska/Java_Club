package com.team6.loops;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class Task4Test extends TestCase {

    @Test
    public void testDoubleArrayTrue(){
        Assert.assertArrayEquals(new int[]{0,2,4,8,6},Task4.doubleArray(new int[]{0,1,2,4,3}));
    }

    @Test
    public void testDoubleArrayFall(){
        Assert.assertArrayEquals(new int[]{0,2,4,8,6},Task4.doubleArray(new int[]{0,1,2,4,3}));
    }
}