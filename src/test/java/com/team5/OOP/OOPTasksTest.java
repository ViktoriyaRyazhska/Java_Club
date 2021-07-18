package com.team5.OOP;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OOPTasksTest {

    OOPTasks oopTasks = new OOPTasks();
    @Test
    void task49() {
        assertTrue(oopTasks.task49("").equals(""), "empty string");
        assertTrue(oopTasks.task49("abcdef").equals("4bcd3f"), "abcdef string");
    }
}