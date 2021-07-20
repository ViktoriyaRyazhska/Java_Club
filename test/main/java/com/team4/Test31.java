package com.team4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test31 extends Task31 {
    @Test
    void Test() {
            Assertions.assertEquals(100, rentalCarCost(3));
            Assertions.assertEquals(140, rentalCarCost(4));
            Assertions.assertEquals(180, rentalCarCost(5));
            Assertions.assertEquals(220, rentalCarCost(6));
    }
}
