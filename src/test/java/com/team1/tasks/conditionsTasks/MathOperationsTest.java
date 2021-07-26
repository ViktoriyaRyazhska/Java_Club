package com.team1.tasks.conditionsTasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathOperationsTest {

    @Test
    void basicMathPlus() {
        assertEquals(4, MathOperations.basicMath("+", 2, 2));
    }

    @Test
    void basicMathDiv() {
        assertEquals(2, MathOperations.basicMath("/", 6, 3));

    }

    @Test
    void basicMathDivZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            MathOperations.basicMath("/",2,0);
        });

        String expectedMessage = "Division by zero";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void basicMathMul() {
        assertEquals(6, MathOperations.basicMath("*", 2, 3));
    }

    @Test
    void basicMathSubt() {
        assertEquals(4, MathOperations.basicMath("-", 6, 2));

    }

    @Test
    void basicMath() {
        assertEquals(0, MathOperations.basicMath("", 2, 0));

    }
}