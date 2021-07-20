package com.team5.Conditions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionsTasksTest {

    ConditionsTasks conditionsTasks = new ConditionsTasks();

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
    void task22() {
        assertEquals("You are 1 year old.",conditionsTasks.task22(2020,2021));
        assertEquals("You are 10 years old.",conditionsTasks.task22(2011,2021));
        assertEquals("You will be born in 1 year.",conditionsTasks.task22(2022,2021));
        assertEquals("You will be born in 10 years.",conditionsTasks.task22(2031,2021));
        assertEquals("You were born this very year!",conditionsTasks.task22(2021,2021));
    }

    @Test
    void task23() {
        assertEquals("Draw!",conditionsTasks.task23("rock","rock"));
        assertEquals("Player 1 won!",conditionsTasks.task23("rock","scissors"));
        assertEquals("Player 2 won!",conditionsTasks.task23("rock","paper"));
    }

    @Test
    void task24(){
            assertEquals(3,conditionsTasks.task24("+",2,1,0));
            assertEquals(1,conditionsTasks.task24("-",2,1,0));
            assertEquals(2,conditionsTasks.task24("*",2,1,0));
            assertEquals(2,conditionsTasks.task24("/",2,1,0));

    }

    @Test
    void task25() {
        assertEquals("Love-false",conditionsTasks.task25(15,15));
        assertEquals("Love-true",conditionsTasks.task25(14,15));
    }
}
