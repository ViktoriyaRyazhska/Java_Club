package com.team4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test60 extends Task60 {
    @Test
    void Testremove() {
        Assertions.assertEquals("Hi", remove("Hi!", 1));
        Assertions.assertEquals("Hi", remove("Hi!", 100));
        Assertions.assertEquals("Hi!!", remove("Hi!!!", 1));
        Assertions.assertEquals("Hi", remove("Hi!!!", 100));
        Assertions.assertEquals("Hi", remove("!Hi", 1));
        Assertions.assertEquals("Hi!", remove("!Hi!", 1));
        Assertions.assertEquals("Hi", remove("!Hi!", 100));
        Assertions.assertEquals("!!Hi !!hi!!! !hi", remove("!!!Hi !!hi!!! !hi", 1));
        Assertions.assertEquals("Hi !!hi!!! !hi", remove("!!!Hi !!hi!!! !hi", 3));
        Assertions.assertEquals("Hi hi!!! !hi", remove("!!!Hi !!hi!!! !hi", 5));
        Assertions.assertEquals("Hi hi hi", remove("!!!Hi !!hi!!! !hi", 100));
    }

}
