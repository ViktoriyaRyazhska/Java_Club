package com.team5.Loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoopsTasksTest {

    LoopsTasks loopsTasks = new LoopsTasks();
    @Test
    void task32() {
        assertEquals("aaaa", loopsTasks.task32(4,"a"));
    }

    @Test
    void task33() {
        assertArrayEquals(new int[]{1,15,15}, loopsTasks.task33(1));
        assertArrayEquals(new int[]{10,56,64}, loopsTasks.task33(10));
    }

    @Test
    void task34() {
        assertEquals(2,loopsTasks.task34(new int[] {2,2,2,2}));
        assertEquals(3,loopsTasks.task34(new int[] {1,2,3,4,5}));
    }

    @Test
    void task35() {
        assertArrayEquals(new int[] {8, 2, 2, 2, 8}, loopsTasks.task35(new int[] {4, 1, 1, 1, 4}));
        assertArrayEquals(new int[] {2, 2, 2, 2, 2, 2}, loopsTasks.task35(new int[] {1, 1, 1, 1, 1, 1}));
    }

    @Test
    void task44() {
        int actual = loopsTasks.task44(5);
        assertEquals(15, actual);
    }

    @Test
    void task46() {
        int actual = loopsTasks.task46(3);
        assertEquals(3, actual);
    }
}