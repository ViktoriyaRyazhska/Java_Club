package com.team1.tasks.conditionsTasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WillThereBeEnoughSpaceTest {

    @Test
    void enough1() {
        assertEquals(4,WillThereBeEnoughSpace.enough(3,6,1));
    }
    @Test
    void enough2() {
        assertEquals(0,WillThereBeEnoughSpace.enough(7,6,1));
    }
}