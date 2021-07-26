package com.team1.tasks.loops;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CatDogYearsCounterTest {

    @Test
    void humanYearsCatYearsDogYears1() {
        assertArrayEquals(new int[]{1,15,15},CatDogYearsCounter.humanYearsCatYearsDogYears(1));
    }

    @Test
    void humanYearsCatYearsDogYears2() {
        int[] years = new int[]{2, 24, 24};
        assertArrayEquals(years, CatDogYearsCounter.humanYearsCatYearsDogYears(2));
    }

    @Test
    void humanYearsCatYearsDogYearsElse() {
        int[] years = new int[]{4, 32, 34};
        assertArrayEquals(years, CatDogYearsCounter.humanYearsCatYearsDogYears(4));
    }
}