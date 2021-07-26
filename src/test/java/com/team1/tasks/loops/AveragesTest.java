package com.team1.tasks.loops;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AveragesTest {

    @Test
    void getAverage() {
        int[] marks = new int []{1,2,3};
        assertEquals(2,Averages.getAverage(marks));
    }
}