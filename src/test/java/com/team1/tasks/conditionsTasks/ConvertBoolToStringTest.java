package com.team1.tasks.conditionsTasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertBoolToStringTest {

    @Test
    void convertTrue() {
        assertEquals("true", ConvertBoolToString.convert(true));
    }

    void convertFalse() {
        assertEquals("true", ConvertBoolToString.convert(false));
    }
}