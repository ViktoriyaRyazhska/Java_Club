package com.team4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test11 extends Task11 {
    @Test
    void TestweatherInfo() {
        Assertions.assertEquals("10.0 is above freezing temperature", weatherInfo(50));
    }

    @Test
    void TestweatherInfo2() {
        Assertions.assertEquals("-5.0 is freezing temperature", weatherInfo(23));
    }
}
