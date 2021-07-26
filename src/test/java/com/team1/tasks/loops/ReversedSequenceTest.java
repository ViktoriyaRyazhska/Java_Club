package com.team1.tasks.loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversedSequenceTest {

    @Test
    void reverse() {
        assertArrayEquals(new int []{3,2,1}, ReversedSequence.reverse(3));

    }
}