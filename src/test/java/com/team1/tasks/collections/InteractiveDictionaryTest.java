package com.team1.tasks.collections;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class InteractiveDictionaryTest {
    InteractiveDictionary dictionary = new InteractiveDictionary();

    @Test
    void lookTest1() {
        dictionary.newEntry("Apple", "A fruit");
        assertEquals("A fruit", dictionary.look("Apple"));
    }

    @Test
    void lookTest2() {
        dictionary.newEntry("John", "A man");
        assertEquals("A man", dictionary.look("John"));
    }

    @Test
    void lookTest3() {
        dictionary.newEntry("Great Gatsby", "A book");
        assertEquals("Cant find entry for Soccer", dictionary.look("Soccer"));
    }
}