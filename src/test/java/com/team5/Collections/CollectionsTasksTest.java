package com.team5.Collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CollectionsTasksTest {

    CollectionsTasks collectionsTasks = new CollectionsTasks();
    @Test
    void task70() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(list, collectionsTasks.task70(3));
    }
}