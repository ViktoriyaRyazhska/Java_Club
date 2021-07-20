package com.team4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test32 extends Task32 {
    @Test
    void Test() {
            Assertions.assertEquals("HelloHelloHello", repeatStr(3, "Hello"));
            Assertions.assertEquals("", repeatStr(3,""));

    }
}
