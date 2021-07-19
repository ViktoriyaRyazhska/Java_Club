package com.team4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test31 extends Task31 {
    @Test
    void Test() {
            assertEquals(100, rentalCarCost(3));
            assertEquals(140, rentalCarCost(4));
            assertEquals(180, rentalCarCost(5));
            assertEquals(220, rentalCarCost(6));
    }
}
