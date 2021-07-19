package com.team4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test30 extends Task30 {
    @Test
    void Test() {
        Assertions.assertEquals("yellow", updateLight("green"));
        Assertions.assertEquals("red", updateLight("yellow"));
		Assertions.assertEquals("green", updateLight("red"));

    }
}
