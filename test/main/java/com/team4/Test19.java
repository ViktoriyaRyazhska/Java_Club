package com.team4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test19 extends Task19 {
    @Test
    void TestisDivisible() {
        Assertions.assertTrue(isDivisible(100,2,5));
        Assertions.assertTrue(isDivisible(10000,20,100));
        Assertions.assertTrue(isDivisible(10005,1,5));
        Assertions.assertFalse(isDivisible(100,3,6));
        Assertions.assertFalse(isDivisible(10005,2,8));
    }
}