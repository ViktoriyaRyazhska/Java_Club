import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task25Test {

  @Test
  void testIsLoveEvenAndEven() {

    boolean actual = task25.isLove(6, 6);

    assertFalse(actual);

  }

  @Test
  void testIsLoveOddAndOdd() {

    boolean actual = task25.isLove(5, 5);

    assertFalse(actual);

  }

  @Test
  void testIsLoveEvenAndOdd() {

    boolean actual = task25.isLove(6, 5);

    assertTrue(actual);

  }

  @Test
  void testIsLoveOddAndEven() {

    boolean actual = task25.isLove(5, 6);

    assertTrue(actual);

  }
}