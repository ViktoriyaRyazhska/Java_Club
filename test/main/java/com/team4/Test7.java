package com.team4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test7 extends Task7 {
    @Test
    void TestPast() {
        Assertions.assertEquals(61000, Past(0,1,1));
    }
}
