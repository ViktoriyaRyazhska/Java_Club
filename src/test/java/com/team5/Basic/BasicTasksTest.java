package com.team5.Basic;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class BasicTasksTest {

    BasicTasks basicTask = new BasicTasks();
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void task1() {
        int actual = basicTask.task1(2);
        assertEquals(4,actual);
    }

    @Test
    void task2() {
        int actual = basicTask.task2(5,5);
        assertEquals(25,actual);
    }

    @Test
    void task3() {
        int actual = basicTask.task3(5,5,5);
        assertEquals(125,actual);
    }

    @Test
    void task4() {
//        int actual = basicTask.task3(5,5,5);
//        assertEquals(125,actual);
    }

    @Test
    void task5() {
//        int actual = basicTask.task3(5,5,5);
//        assertEquals(125,actual);
    }

    @Test
    void task6() {
//        int actual = basicTask.task3(5,5,5);
//        assertEquals(125,actual);
    }

    @Test
    void task7() {
        int actual = basicTask.task7(1, 2, 3);
        assertEquals(483000, actual);
    }

    @Test
    void task8() {
        int actual = basicTask.task8(1754);
        assertEquals(18, actual);
    }

    @Test
    void task9() {
        int actual = basicTask.task9(10);
        assertEquals(-10, actual);
    }
}
