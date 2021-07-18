import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task38Test {

    @Test
    void betterThanAverage() {
        boolean expected = true;
        assertEquals(true, task38.betterThanAverage(new int[] {2, 3}, 5));

        boolean expected1 = false;
        assertEquals(false, task38.betterThanAverage(new int[] {100, 90}, 11));


    }


}