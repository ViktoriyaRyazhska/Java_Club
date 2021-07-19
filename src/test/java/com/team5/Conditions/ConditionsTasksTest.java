package com.team5.Conditions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionsTasksTest {

    ConditionsTasks conditionsTasks = new ConditionsTasks();

    @Test
    void task26() {
        assertEquals("One", conditionsTasks.task26(1));
        assertEquals("Three", conditionsTasks.task26(3));
        assertEquals("Five", conditionsTasks.task26(5));
    }

    @Test
    void task27() {
        assertEquals("green", conditionsTasks.task27("red"));
        assertEquals("red", conditionsTasks.task27("yellow"));
    }

    @Test
    void task28() {
        assertEquals(80, conditionsTasks.task28(2));
        assertEquals(220, conditionsTasks.task28(6));
        assertEquals(350, conditionsTasks.task28(10));
    }

    @Test
    void task18() {
        int actual = conditionsTasks.task18(5);
        assertEquals(-5, actual);
    }

    @Test
    void task19() {
        boolean actual = conditionsTasks.task19(10, 5, 2);
        assertEquals(true, actual);
    }

    @Test
    void task20() {
        String actual = conditionsTasks.task20(true);
        assertEquals("true", actual);
    }

    @Test
    void task21() {
        String actual = conditionsTasks.task21(100, true);
        assertEquals("£1000", actual);
    }
}