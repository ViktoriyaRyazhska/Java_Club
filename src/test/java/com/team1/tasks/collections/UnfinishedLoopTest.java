package com.team1.tasks.collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UnfinishedLoopTest {

    @Test
    void UnfinishedLoopTest1(){

        assertEquals(Arrays.asList(1,2,3,4,5,6,7,8,9,10), UnfinishedLoop.createList(10));
    }

}