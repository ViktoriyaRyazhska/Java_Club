package com.team6.basic.tasks;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class Task4Test extends TestCase {

    @Test
    public void testIsExactNumberExist() {
       Assert.assertEquals("\tWe know exact number = 25" ,Task4.isExactNumber(250,10));
    }

    @Test
    public void testIsExactNumberFall(){
        Assert.assertNotEquals("\tWe know exact number = 24" ,Task4.isExactNumber(250,10));
    }
}