package com.team4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test48 extends Task48 {
    @Test
    void Testopposite() {
        Assertions.assertEquals(-1, opposite(1));
    }

    @Test
    void Testopposite2() {
        Assertions.assertEquals(35, opposite(-35));
    }
}
