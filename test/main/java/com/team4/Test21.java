package com.team4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test21 extends Task21 {
    @Test
    void TestPast() {
        Assertions.assertEquals(61000, Past(6100, true));
		Assertions.assertEquals(7000, Past(7000, false));
    }
}
