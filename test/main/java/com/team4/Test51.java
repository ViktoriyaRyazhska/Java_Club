package com.team4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test51 extends Task51 {
    @Test
    void TestnoSpace() {
        Assertions.assertEquals("8j8mBliB8gimjB8B8jlB", noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
        Assertions.assertEquals("88Bifk8hB8BB8BBBB888chl8BhBfd", noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"));
        Assertions.assertEquals("8aaaaaddddr", noSpace("8aaaaa dddd r     "));
        Assertions.assertEquals("jfBmgklf8hg88lbe8", noSpace("jfBm  gk lf8hg  88lbe8 "));
        Assertions.assertEquals("8jaam", noSpace("8j aam"));
    }
}
