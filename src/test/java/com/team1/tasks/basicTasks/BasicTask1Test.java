package com.team1.tasks.basicTasks;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BasicTask1Test {

    @org.junit.jupiter.api.Test
    void doubleInteger() {
        assertEquals(2,BasicTask1.doubleInteger(1));
    }
}