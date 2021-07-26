package com.team1.tasks.loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SheepCounterTest {

    @Test
    void countSheep() {

        assertEquals(2, SheepCounter.countSheep(new Boolean[]{true, true}));
    }
}