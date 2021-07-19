package com.team4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test55 extends Task55 {
    @Test
    public void test1() {
        Assertions.assertEquals(5, howOld("5 years old"));
    }
    @Test
    public void test2() {
        Assertions.assertEquals(9, howOld("9 years old"));
    }
    @Test
    public void test3() {
        Assertions.assertEquals(1, howOld("1 year old"));
    }
}
