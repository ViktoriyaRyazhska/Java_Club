package com.team6.basic.tasks;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Task1Test extends TestCase {

    @Before
    public void setUp() throws Exception {
        super.setUp();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testExecute() {
        assertEquals(8,Task1.doubleInteger(4));
    }

    @Test
    public void testExecute2(){
        assertEquals(20000000,Task1.doubleInteger(10000000));
    }

}