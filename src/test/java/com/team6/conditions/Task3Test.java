package com.team6.conditions;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class Task3Test extends TestCase {

    @Test
    public void testConvertTrue() {
        Assert.assertEquals("true",Task3.convert(true));
    }

    @Test
    public void testConvertFall() {
        Assert.assertEquals("false",Task3.convert(false));
    }
}