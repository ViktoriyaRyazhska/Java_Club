package com.team6.basic.tasks;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class Task8Test extends TestCase {

    @Test
    public void testCalculateCenturyTrue(){
        Assert.assertEquals(18,Task8.calculateCentury(1701));
    }

    @Test
    public void testExtremeCentury(){
        Assert.assertEquals(17,Task8.calculateCentury(1700));
    }

    @Test
    public void testByNegativeNumber(){
        Assert.assertEquals(0,Task8.calculateCentury(-100));
    }

}