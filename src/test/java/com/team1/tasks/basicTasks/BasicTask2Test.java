package com.team1.tasks.basicTasks;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicTask2Test {

    @Test
    void multiply() {
        assertEquals(6,BasicTask2.multiply(2,3));
        assertEquals(6,BasicTask2.multiply(3,2));
        assertEquals(0,BasicTask2.multiply(3,0));
    }
}