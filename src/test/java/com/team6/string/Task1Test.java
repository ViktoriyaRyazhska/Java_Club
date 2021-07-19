package com.team6.string;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class Task1Test extends TestCase {

    @Test
    public void testNumberToStringTrue() {
        Assert.assertEquals("423",Task1.numberToString(423));
    }

    @Test
    public void testNumberToStringFall() {
        Assert.assertNotEquals("642342145",Task1.numberToString(100000000));
    }
}