package com.team1.tasks.collections;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FilteringEvenNumbersTest {


    @Test
    void filterOddNumber() {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,2,3,4,5,6,3,3,3,4,5,6,7,8,9,10));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,3,5,3,3,3,5,7,9));
        assertEquals(list2,FilteringEvenNumbers.filterOddNumber(list1));

    }
}