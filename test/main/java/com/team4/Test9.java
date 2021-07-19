package com.team4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test9 extends Task9 {
    @Test
    void TestmakeNegative() {
        Assertions.assertEquals(-42, makeNegative(42));
        Assertions.assertEquals(-32, makeNegative(-32));
    }
}
