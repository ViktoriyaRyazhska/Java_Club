package com.team4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test1 extends Task1 {
    @Test
    void TestdoubleInteger() {
        Assertions.assertEquals( 4, Task1.doubleInteger(2));
        Assertions.assertEquals( 10, Task1.doubleInteger(5));

    }
}
