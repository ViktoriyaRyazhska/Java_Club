package com.team4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test49 extends Task49 {
    @Test
    void Test() {
        Assertions.assertEquals("one-two-three", replaceDots("one.two.three"));


    }
}
