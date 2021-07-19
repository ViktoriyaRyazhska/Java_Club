package com.team4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test57 extends Task57 {
    @Test
    void TestabbrevName() {
        Assertions.assertEquals("S.H", abbrevName("Sam Harris"));
        Assertions.assertEquals("P.F", abbrevName("Patrick Feenan"));
        Assertions.assertEquals("E.C", abbrevName("Evan Cole"));
        Assertions.assertEquals("P.F", abbrevName("P Favuzzi"));
        Assertions.assertEquals("D.M", abbrevName("David Mendieta"));
    }
}
