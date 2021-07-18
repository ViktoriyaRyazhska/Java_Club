package com.team6.classes;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class Task2Test extends TestCase {

    @Test
    public void testPlus100True(){
        Assert.assertEquals(250,Task2.plus100(150));
    }

    @Test
    public void testPlus100Fall(){
        Assert.assertNotEquals(1000,Task2.plus100(134));
    }
}