package com.team6.conditions;

import com.team6.basic.CustomException;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class Task2Test extends TestCase  {
/*

    @Test
    public void testIsDivisibleTrue(){
        Assert.assertTrue(Task2.isDivisible(20, 4, 5));
    }

    @Test
    public void testIsDivisibleFall(){
        Assert.assertFalse(Task2.isDivisible(1000,55,33));
    }
*/

    @Test
    public void testIsDivisibleByZero() {
        assertFalse(Task2.isDivisible(0, 0, 0));
    }
}