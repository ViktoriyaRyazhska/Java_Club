package com.team4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test8 extends Task8 {
    @Test
    void Testcentury() {
        Assertions.assertEquals(18, century(1705));
        Assertions.assertEquals(19, century(1900));
        Assertions.assertEquals(17, century(1601));
        Assertions.assertEquals(20, century(2000));
        Assertions.assertEquals(1,  century(89));
    }
}
