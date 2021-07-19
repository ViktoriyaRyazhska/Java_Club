package com.team4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test27 extends Task27 {
    @Test
    void Test() {
        Assertions.assertEquals(0, enough(30,30,5));
        Assertions.assertEquals(10, enough(100, 60, 50));

    }
}
