package com.team6.basic.tasks;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class Task5Test extends TestCase {

    @Test
    public void testJohnny(){
        Assert.assertEquals("\tHello, my love",Task5.greeting("Johnny"));
    }

    @Test
    public void testOtherName(){
        Assert.assertEquals("\tHello, Vasya",Task5.greeting("Vasya"));
    }

}