package com.team6.conditions;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class Task1Test extends TestCase {

    @Test
    public void testByZero() {
        Assert.assertEquals(0,Task1.opposite(0));
    }

    @Test
    public void testByNegativeNumber() {
        Assert.assertEquals(-1,Task1.opposite(1));
    }

    @Test
    public void testByPositiveNumber() {
        Assert.assertEquals(1,Task1.opposite(-1));
    }
}