package com.team5.Classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FractionTest {


    @Test
    void GeneralTest() {
        assertEquals(new Fraction(37, 40), new Fraction(1, 8).add(new Fraction(4, 5)));
        assertEquals(new Fraction(838923, 926885), new Fraction(610, 941).add(new Fraction(253, 985)));
        assertEquals(new Fraction(16880, 3591), new Fraction(956, 798).add(new Fraction(662, 189)));
    }

    @Test
    void addTest() {
        assertEquals(new Fraction(1, 2), new Fraction(4, 8));
        assertEquals(new Fraction(2, 3), new Fraction(10, 15));
    }

    @Test
    void testToString() {
        assertEquals("5/6", (new Fraction(2, 4).add(new Fraction(1, 3))).toString());
        assertEquals("13/15", (new Fraction(1, 5).add(new Fraction(4, 6))).toString());
    }
}