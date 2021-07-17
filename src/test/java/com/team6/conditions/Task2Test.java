package com.team6.conditions;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class Task2Test extends TestCase {

    @Test
    public void testIsDivisibleTrue() {
        Assert.assertTrue(Task2.isDivisible(20, 4, 5));
    }

    @Test
    public void testIsDivisibleFall(){
        Assert.assertFalse(Task2.isDivisible(1000,55,33));
    }

    @Test (expected = ArithmeticException.class)
    public void testIsDivisibleByZero(){
        // TODO:: Fixed this problem
        Assert.assertTrue(Task2.isDivisible(0,0,0));
    }
}