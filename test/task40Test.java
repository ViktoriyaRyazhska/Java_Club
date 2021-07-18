import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task40Test {

    @Test
    void sum() {
        assertEquals(15, task40.sum(new int[]{1,2,3,4,5}));

        assertEquals(13, task40.sum(new int[]{1,-2,3,4,5}));

        assertEquals(0, task40.sum(new int[]{}));

        assertEquals(0, task40.sum(new int[]{-1,-2,-3,-4,-5}));

        assertEquals(9, task40.sum(new int[]{-1,2,3,4,-5}));
    }
}