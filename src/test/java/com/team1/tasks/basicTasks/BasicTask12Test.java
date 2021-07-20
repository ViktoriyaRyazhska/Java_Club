package com.team1.tasks.basicTasks;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

class BasicTask12Test {

    @ParameterizedTest
    @ValueSource (strings = {"xo", "XO", "axboc", "AXBOC", "XXoOOOx", "xxOoooX", "abc", " "})
    void getXOTrue(String input) {
        assertTrue(BasicTask12.getXO(input));
    }

    @ParameterizedTest
    @ValueSource (strings = {"xO", "Xo", "aXboc", "AxBOC", "XXOOOOx", "xxOoooxx"})
    void getXOFalse(String input) {
        assertFalse(BasicTask12.getXO(input));
    }

}