import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task64Test {

    @Test
    void strCount() {
        int expected = 1;
        assertEquals(expected,task64.strCount("Hello",'o'));

        int expected1 = 0;
        assertEquals(expected1, task64.strCount("",'i'));
    }
}