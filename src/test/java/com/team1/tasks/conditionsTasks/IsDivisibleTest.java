package com.team1.tasks.conditionsTasks;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsDivisibleTest {

    @Test
    void isDivisibleTrue() {
        Assert.assertTrue(IsDivisible.isDivisible(4,2,1));
    }
    @Test
    void isDivisibleFalse() {
        Assert.assertFalse(IsDivisible.isDivisible(4,3,1));
    }
}