package com.team1.tasks.basicTasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicTask9Test {

    @Test
    void makeNegative() {
        assertEquals(-20,BasicTask9.makeNegative(-20));
        assertEquals(0,BasicTask9.makeNegative(0));
    }
    @Test
    void makeNegativeFromNegative(){
        assertEquals(-20,BasicTask9.makeNegative(-20));
    }
}