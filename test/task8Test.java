import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task8Test {

  @Test
  void testToConvertYearToCentury() {

    int expected = 21;

    int actual = task8.century(2021);

    assertEquals(expected, actual);

  }
}