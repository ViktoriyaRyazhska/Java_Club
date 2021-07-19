package com.team4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test3 extends Task3 {
    @Test
    void TestgetVolumeOfCuboid() {
        Assertions.assertEquals(4, getVolumeOfCuboid(1, 2, 2));
        Assertions.assertEquals(63, getVolumeOfCuboid(6.3, 2, 5));
    }
}
