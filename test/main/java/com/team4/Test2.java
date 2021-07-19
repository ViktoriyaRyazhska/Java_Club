package com.team4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test2 extends Task2 {
    @Test
    void Testmultiply() {
        Assertions.assertEquals(4, multiply(2, 2));
        Assertions.assertEquals(10, multiply(5, 2));
        Assertions.assertEquals(100, multiply(100, 1));
        Assertions.assertEquals(0, multiply(0, 1000));
    }
}
