package com.team4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test24 extends Task24 {
    @Test
    void Test() {
        Assertions.assertEquals(20, basicMath("+",10,10));
        Assertions.assertEquals(15, basicMath("-",20,5));
		Assertions.assertEquals(49, basicMath("*",5,8));
		Assertions.assertEquals(7, basicMath("/",49,7));
    }
}
