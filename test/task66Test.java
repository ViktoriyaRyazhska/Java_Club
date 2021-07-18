import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task66Test {

    @Test
    void correct() {
        assertEquals("IF", task66.correct(task66.correct("1F")));
        //assertEquals("RO", task66.correct(task66.correct("R0")));
        assertEquals("STEPHEN", task66.correct(task66.correct("5TEPHEN")));
    }
}