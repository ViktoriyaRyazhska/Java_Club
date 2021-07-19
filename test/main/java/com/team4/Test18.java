package com.team4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Test18 extends Task18 {
    @Test
    void TestdoubleInteger() {
        Assertions.assertEquals( -4, Task18.opposite(4));
        Assertions.assertEquals( -10, Task18.opposite(10));

    }
}
