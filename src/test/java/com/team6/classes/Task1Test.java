package com.team6.classes;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class Task1Test extends TestCase {

    @Test
    public void testByNull(){
        Task1 task1 = new Task1(1,"Sd",1);
        Assert.assertNotNull(task1.getStringValue());
        Assert.assertNotNull(task1.getAnObject());
    }

}