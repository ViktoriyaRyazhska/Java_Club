package com.team4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test6 extends Task6 {
    @Test
    void TesttoBinary() {
        Assertions.assertEquals(1, toBinary(1));
        Assertions.assertEquals(10, toBinary(2));
        Assertions.assertEquals(11, toBinary(3));
        Assertions.assertEquals(101, toBinary(5));
    }
}
