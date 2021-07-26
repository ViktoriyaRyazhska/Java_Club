package com.team1.tasks.conditionsTasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OppositeNumTest {

    @Test
    void opposite1() {
        assertEquals(-1,OppositeNum.opposite(1));
    }

    @Test
    void opposite2() {
        assertEquals(2,OppositeNum.opposite(-2));
    }
}