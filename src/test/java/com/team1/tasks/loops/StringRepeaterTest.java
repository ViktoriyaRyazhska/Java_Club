package com.team1.tasks.loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringRepeaterTest {

    @Test
    void repeatStr() {
        assertEquals("tatata",StringRepeater.repeatStr(3,"ta"));
    }
}