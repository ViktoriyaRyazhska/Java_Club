package com.team4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test5 extends Task5 {
    @Test
    void Test() {
        Assertions.assertEquals("Hello, Jim!", greet("Jim"));
        Assertions.assertEquals("Hello, Jane!", greet("Jane"));
        Assertions.assertEquals("Hello, Simon!", greet("Simon"));
        Assertions.assertEquals("Hello, my love!", greet("Johnny"));
    }
}
