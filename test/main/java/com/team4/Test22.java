package com.team4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test22 extends Task22 {
    @Test
    void TestdatingRange() {
        Assertions.assertEquals("You were born this very year!", CalculateAge(2005,2005));
        Assertions.assertEquals("You will be born in 5 year(s).", CalculateAge(1995,1990));
        Assertions.assertEquals("You are 5 years old.", CalculateAge(1995, 2000));

    }
}
