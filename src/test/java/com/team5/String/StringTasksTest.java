package com.team5.String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringTasksTest {

    StringTasks stringTasks = new StringTasks();

    @Test
    void task59() {
        assertEquals("Position of alphabet: 1", stringTasks.task59('a'));
        assertEquals("Position of alphabet: 26", stringTasks.task59('z'));
        assertEquals("Position of alphabet: 5", stringTasks.task59('e'));
    }

    @Test
    void task60() {
        assertEquals("01011110001100111", stringTasks.task60("45385593107843568"));
        assertEquals("101000111101101", stringTasks.task60("509321967506747"));
    }

    @Test
    void task61() {
        assertEquals(5, stringTasks.task61("5 years old"));
    }

    @Test
    void task62() {
        assertEquals(10, stringTasks.task62(50));

    }

    @Test
    void task63() {
        assertEquals("S.H", stringTasks.task63("Sam Harris"));
        assertEquals("P.F", stringTasks.task63("Patrick Feenan"));
        assertEquals("E.C", stringTasks.task63("Evan Cole"));
    }
}