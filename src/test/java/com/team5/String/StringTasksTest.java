package com.team5.String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringTasksTest {

    StringTasks stringTasks = new StringTasks();

    @Test
    void task55() {
        assertEquals("a-b-c-",stringTasks.task55("a.b.c."));
    }

    @Test
    void task56() {
        assertEquals("Rodrigo plays banjo",stringTasks.task56("Rodrigo"));
        assertEquals("Tom does not play banjo",stringTasks.task56("Tom"));

    }

    @Test
    void task57() {
        assertEquals("abc",stringTasks.task57("a b c "));

    }

    @Test
    void task58() {
        assertEquals("adgbehcfi",stringTasks.task58("abc","def","ghi",""));
    }


    @Test
    void task59() {
        assertEquals("Position of alphabet: 1", stringTasks.task59('a'));
        assertEquals("Position of alphabet: 26", stringTasks.task59('z'));
        assertEquals("Position of alphabet: 5", stringTasks.task59('e'));
    }

    @Test
    void task60() {
        assertEquals("01011110001100111", stringTasks.task60("45385593107843568"));
        assertEquals("101000111101101", stringTasks.task60("509321967506747"));
    }

    @Test
    void task61() {
        assertEquals(5, stringTasks.task61("5 years old"));
    }

    @Test
    void task62() {
        assertEquals(10, stringTasks.task62(50));

    }

    @Test
    void task63() {
        assertEquals("S.H", stringTasks.task63("Sam Harris"));
        assertEquals("P.F", stringTasks.task63("Patrick Feenan"));
        assertEquals("E.C", stringTasks.task63("Evan Cole"));
    }

    @Test
    void task64() {
        int actual = stringTasks.task64("Vovochka", 'o');
        assertEquals(2, actual);
    }

    @Test
    void task65() {
        String actual = stringTasks.task65(new String[]{"Aboba", "Pop-it", "Simple-dimple"});
        assertEquals("Aboba", actual);
    }

    @Test
    void task66() {
        String actual = stringTasks.task66("V0VA L1KE CANDIE5");
        assertEquals("VOVA LIKE CANDIES", actual);
    }

    @Test
    void task67() {
        String actual = stringTasks.task67("VOVA love YOU");
        assertEquals("vova LOVE you", actual);
    }

    @Test
    void task68() {
        String actual = stringTasks.task68("test!!! test again!!", 4);
        assertEquals("test test again!", actual);
    }

}
