import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task27Test {

  @Test
  void testEnoughPassengers() {

    int expected = 5;

    int actual = task27.enough(10, 5, 10);

    assertEquals(expected, actual);

  }
}