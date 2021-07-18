package com.team6.loops;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class Task2Test extends TestCase {

    @Test
    public void testConvertHumanAgeToDogAndCatTrue(){
        Assert.assertArrayEquals(new int[]{1,15,15},Task2.ConvertHumanAgeToDogAndCat(1));
    }

    @Test
    public void testConvertHumanAgeToDogAndCatFall(){
        Assert.assertNotEquals(new int[]{2,40,12},Task2.ConvertHumanAgeToDogAndCat(2));
    }

    @Test
    public void testConvertHumanAgeToDogAndCatByZero(){
        Assert.assertArrayEquals(new int[]{0,0,0},Task2.ConvertHumanAgeToDogAndCat(0));
    }


}