package com.team6.basic.tasks;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class Task9Test extends TestCase {

    @Test
    public void testByZero() {
        Assert.assertEquals(0,Task9.negativeConverter(0));
    }

    @Test
    public void testByNegativeNumber() {
        Assert.assertEquals(-1, Task9.negativeConverter(1));
    }

    @Test
    public void testByPositiveNumber() {
        Assert.assertEquals(1, Task9.negativeConverter(-1));
    }
}