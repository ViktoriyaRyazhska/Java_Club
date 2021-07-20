package com.team1.tasks.basicTasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicTask3Test {

    @Test
    void getVolumeOfCuboid() {
        assertEquals(8,BasicTask3.getVolumeOfCuboid(2,2,2));
    }
}