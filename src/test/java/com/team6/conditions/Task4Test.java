package com.team6.conditions;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class Task4Test extends TestCase {

    @Test
    public void testIsBonusTimeTrue() {
        Assert.assertEquals("£1000",Task4.bonusTime(100,true));
    }

    @Test
    public void testIsBonusTimeFalse() {
        Assert.assertEquals("£100",Task4.bonusTime(100,false));
    }

    @Test
    public void testIsBonusTimeTrueAndSalaryZero(){
        Assert.assertEquals("£0",Task4.bonusTime(0,true));
    }
}