package com.team6.string;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class Task3Test {

    @Test
    public void testSayHelloTrue() {
        Assert.assertEquals("Hello,"+ "Vasya Petya " +" Welcome to "+"Other"+" "+"Some"+"!",
                Task3.sayHello(new String[]{"Vasya","Petya"},"Other","Some"));
    }

    @Test
    public void testSayHelloFall() {
        Assert.assertNotEquals("Hello,"+ "Vasya Petya " +" Welcome to "+"Other"+" "+"Some"+"!",
                Task3.sayHello(new String[]{"Petya","Vasya"},"Other","Some"));
    }
}