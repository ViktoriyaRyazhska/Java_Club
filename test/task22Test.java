import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task22Test {

    @Test
    void calculateAge() {
     String expected = "You are 4 years old.";
        String actual = task22.CalculateAge(2012, 2016);
        assertEquals(expected, actual);
    }
}