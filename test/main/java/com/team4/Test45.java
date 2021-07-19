package com.team4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test45 extends Task45 {
    @Test
    void TestmakeMove() {
        Assertions.assertEquals(3, makeMove(3));
    }
}
