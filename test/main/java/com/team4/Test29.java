package com.team4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test29 extends Task29 {
    @Test
    void Test() {
        Assertions.assertEquals("One", switchItUp(1));
        Assertions.assertEquals("Two", switchItUp(2));
		Assertions.assertEquals("Zero", switchItUp(0));

    }
}
