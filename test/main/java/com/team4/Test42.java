package com.team4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test42 extends Task42 {
    @Test
    void TestTwiceAsOld() {
        Assertions.assertEquals(30, TwiceAsOld(30,0));
        Assertions.assertEquals(16, TwiceAsOld(30,7));
        Assertions.assertEquals(15, TwiceAsOld(45,30));
    }
}
