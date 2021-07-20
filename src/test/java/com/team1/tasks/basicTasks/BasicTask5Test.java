package com.team1.tasks.basicTasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicTask5Test {

    @Test
    void greet() {
        assertEquals("Hello, John!",BasicTask5.greet("John"));
    }
}