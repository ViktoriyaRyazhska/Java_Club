package com.team4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test52 extends Task52 {
    @Test
    void TesttripleTrouble() {
        Assertions.assertEquals("ttlheoiscstk", tripleTrouble("this", "test", "lock"));
        Assertions.assertEquals("abcabc", tripleTrouble("aa","bb","cc"));
        Assertions.assertEquals("Batman", tripleTrouble("Bm", "aa", "tn"));
        Assertions.assertEquals("LexLuthor", tripleTrouble("LLh","euo","xtr"));
    }
}
