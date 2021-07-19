package com.team4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test32 extends Task32 {
    @Test
    void Test() {
            assertEquals("HelloHelloHello", repeatStr(3, "Hello"));
            assertEquals("", rentalCarCost(3,""));

    }
}
