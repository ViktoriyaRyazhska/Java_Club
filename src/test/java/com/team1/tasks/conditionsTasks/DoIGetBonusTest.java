package com.team1.tasks.conditionsTasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoIGetBonusTest {

    @Test
    void bonusTimeTrue() {
        assertEquals("£100", DoIGetBonus.bonusTime(10, true));
    }

    @Test
    void bonusTimeFasle() {
        assertEquals("£10", DoIGetBonus.bonusTime(10, false));
    }
}