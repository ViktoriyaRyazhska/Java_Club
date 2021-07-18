package com.team6.loops;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class Task1Test extends TestCase {

    @Test
    public void testRepeatStrTrue(){
        Assert.assertEquals("aaaa",Task1.repeatStr(4,"a"));
        Assert.assertEquals("asasasas",Task1.repeatStr(4,"as"));
    }

    @Test
    public void testRepeatStrFall(){
        Assert.assertNotEquals("asdfg",Task1.repeatStr(10,"asd"));
    }
}