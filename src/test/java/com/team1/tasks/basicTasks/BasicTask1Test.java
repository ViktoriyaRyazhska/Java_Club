package com.team1.tasks.basicTasks;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class BasicTask1Test {

    @org.junit.jupiter.api.Test
    void doubleInteger() {
        assertEquals(2,BasicTask1.doubleInteger(1));
    }
}