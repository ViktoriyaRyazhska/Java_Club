package com.team1.tasks.conditionsTasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HowOldInFutureTest {

    @Test
    void calculateAge1() {
        assertEquals("You are 1 year old.", HowOldInFuture.calculateAge(2000,2001));
    }
    @Test
    void calculateAge2() {
        assertEquals("You will be born in 1 year.", HowOldInFuture.calculateAge(2001,2000));
    }
    @Test
    void calculateAge3() {
        assertEquals("You were born this very year!", HowOldInFuture.calculateAge(2000,2000));
    }
    @Test
    void calculateAge4() {
        assertEquals("You are 21 years old.", HowOldInFuture.calculateAge(2000,2021));
    }
    @Test
    void calculateAge5() {
        assertEquals("You will be born in 21 years.", HowOldInFuture.calculateAge(2021,2000));
    }

}