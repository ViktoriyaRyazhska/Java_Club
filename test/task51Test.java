import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task51Test {

  @Test
  void testNumberToString() {

    String expected = "123";

    String actual = task51.numberToString(123);

    assertEquals(expected, actual);

  }
}