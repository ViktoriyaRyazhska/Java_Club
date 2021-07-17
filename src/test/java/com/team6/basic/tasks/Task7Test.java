package com.team6.basic.tasks;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class Task7Test extends TestCase {

    @Test
    public void testConvertTimeToMilisecondTrue() {
        Assert.assertEquals(3661000,Task7.convertTimeToMilisecond(1,1,1));
    }

    @Test
    public void testConvertTimeToMilisecondTrueByZero(){
        Assert.assertEquals(0,Task7.convertTimeToMilisecond(0,0,0));
    }

    @Test
    public void testConvertTimeToMilisecondTrueByNegativeNumber(){
        Assert.assertEquals(0,Task7.convertTimeToMilisecond(-1,0,0));
        Assert.assertEquals(0,Task7.convertTimeToMilisecond(1,-2,0));
        Assert.assertEquals(0,Task7.convertTimeToMilisecond(1,0,-3));
    }
}