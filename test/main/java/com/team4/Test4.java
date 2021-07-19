package com.team4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test4 extends Task4 {
    @Test
    void TestisDivisible() {
        Assertions.assertTrue(isDivisible(4050,27));
        Assertions.assertTrue(isDivisible(10000,20));
        Assertions.assertTrue(isDivisible(10005,1));
        Assertions.assertFalse(isDivisible(4066,27));
        Assertions.assertFalse(isDivisible(10005,2));
    }
}
