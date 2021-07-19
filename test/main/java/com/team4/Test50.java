package com.team4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test50 extends Task50 {
    @Test
    void TestareYouPlayingBanjo() {
        Assertions.assertEquals( "Martin does not play banjo", areYouPlayingBanjo("Martin"));
        Assertions.assertEquals( "Rikke plays banjo", areYouPlayingBanjo("Rikke"));
    }
}
