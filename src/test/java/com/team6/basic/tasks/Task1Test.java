package com.team6.basic.tasks;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Task1Test extends TestCase {

    @Before
    public void setUp() throws Exception {
        super.setUp();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testDoubleIntegerTrue() {
       Assert.assertEquals(8,Task1.doubleInteger(4));
    }

    @Test
    public void testDoubleIntegerFall(){
        Assert.assertNotEquals(30000000,Task1.doubleInteger(10000000));
    }

}