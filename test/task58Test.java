import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task58Test {

    @Test
    void tripleTrouble() {
    String expected = "abcabc";

    assertEquals(expected,task58.tripleTrouble("aa","bb","cc"));
    }
}