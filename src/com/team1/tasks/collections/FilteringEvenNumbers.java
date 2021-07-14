package com.team1.tasks.collections;

import java.util.List;
import java.util.stream.Collectors;

public class FilteringEvenNumbers {


    public FilteringEvenNumbers() {
    }

    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers) {
        return listOfNumbers.stream().filter(s -> s % 2 != 0).collect(Collectors.toList());
    }
}
