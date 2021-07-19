package com.team4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test26 extends Task26 {
    @Test
    void Test() {
        Assertions.assertEquals("Yes", boolToWord(true));
        Assertions.assertEquals("No", boolToWord(false));

    }
}
