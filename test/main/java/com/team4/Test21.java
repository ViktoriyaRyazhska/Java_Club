package com.team4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test21 extends Task21 {
    @Test
    void TestPast() {
        Assertions.assertEquals(61000, bonusTime(6100, true));
		Assertions.assertEquals(7000, bonusTime(7000, false));
    }
}
