package com.team1.tasks.conditionsTasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OppositesAttractTest {

    @Test
    void isLove1() {
        assertTrue(OppositesAttract.isLove(3,2));
    }
    @Test
    void isLove2() {
        assertTrue(OppositesAttract.isLove(2,3));
    }


    @Test
    void isLove3() {
        assertFalse(OppositesAttract.isLove(2,2));
    }
}

