package com.team6.loops;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class Task5Test extends TestCase {

    @Test
    public void testCountSheepTrue(){
        Assert.assertEquals(5,Task5.countSheeps(new Boolean[]{true,true,false,false,true,true,false,false,true}));
    }

    @Test
    public void testCountSheepFall(){
        Assert.assertNotEquals(10,Task5.countSheeps(new Boolean[]{true,true,false,false,true,true,false,false,true}));
    }
}