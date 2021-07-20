package com.team4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test25 extends Task25 {
    @Test
    void Test() {
        Assertions.assertTrue(isLove(19, 21));
        Assertions.assertFalse(isLove(20, 22));
    }
}
