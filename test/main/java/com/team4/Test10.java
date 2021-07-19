package com.team4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test10 extends Task10 {
    @Test
    void TestdatingRange() {
        Assertions.assertEquals("15-20", datingRange(17));
        Assertions.assertEquals("27-66", datingRange(40));
        Assertions.assertEquals("14-16", datingRange(15));
        Assertions.assertEquals("24-56", datingRange(35));
        Assertions.assertEquals("9-11", datingRange(10));
    }
}
