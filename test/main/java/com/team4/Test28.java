package com.team4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test28 extends Task28 {
    @Test
    void Test() {
        Assertions.assertEquals(1, sequence(72));
        Assertions.assertEquals(1, sequence(90));
		Assertions.assertEquals(0, sequence(42));

    }
}
