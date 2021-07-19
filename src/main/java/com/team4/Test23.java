package com.team4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test23 extends Task23 {
    @Test
    void TestPast() {
        Assertions.assertEquals("Player 1 won!", rps("rock","scissors"));
		Assertions.assertEquals("Player 2 won!", rps("scissors","rock"));
		Assertions.assertEquals("Draw!", rps("scissors","scissors"));
    }
}
