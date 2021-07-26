package com.team1.tasks.collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PushAnObjectIntoArrayTest {

    @Test
    void push() {
        assertEquals(Arrays.asList("an object"), PushAnObjectIntoArray.push());
    }
}