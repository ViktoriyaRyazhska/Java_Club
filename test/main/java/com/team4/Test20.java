package com.team4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test20 extends Task20 {
    @Test
    void Test() {
        Assertions.assertEquals("true", convert(true));
        Assertions.assertEquals("false", convert(false));
    }
}
