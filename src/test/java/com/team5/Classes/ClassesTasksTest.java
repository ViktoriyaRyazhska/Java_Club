package com.team5.Classes;

import com.team5.Menu.Input;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassesTasksTest {
    ClassesTasks classesTasks = new ClassesTasks();

    @Test
    void task16() {
        Fighter fighter1 = new Fighter("John", 100, 10);
        Fighter fighter2 = new Fighter("Tom", 95, 11);
        assertEquals("Tom",classesTasks.task16(fighter1,fighter2,"Tom"));
    }
}
