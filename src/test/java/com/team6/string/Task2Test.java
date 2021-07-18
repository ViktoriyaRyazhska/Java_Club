package com.team6.string;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class Task2Test extends TestCase {

    @Test
    public void testSolutionTrue() {
        Assert.assertEquals("asdf",Task2.solution("fdsa"));
    }

    @Test
    public void testSolutionFall() {
        Assert.assertNotEquals("asdfddsa",Task2.solution("fdsaswwwd"));
    }

    @Test
    public void testSolutionByEmptyField() {
        Assert.assertEquals("",Task2.solution(""));
    }
}