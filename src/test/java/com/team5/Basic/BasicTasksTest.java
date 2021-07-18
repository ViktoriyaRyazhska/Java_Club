package com.team5.Basic;

import com.team5.Menu.Input;
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
        assertEquals(4,-2);
        assertEquals(4,actual);
    }

    @Test
    void task2() {

    }

    @Test
    void task3() {
    }

    @Test
    void task4() {
    }

    @Test
    void task5() {
    }

    @Test
    void task6() {
    }

    @Test
    void task7() {
    }

    @Test
    void task8() {
    }

    @Test
    void task9() {
    }
}
