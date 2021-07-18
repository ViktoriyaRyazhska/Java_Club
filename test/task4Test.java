import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task4Test {

  @Test
  void testIsDivisible() {

    boolean actual = task4.isDivisible(10, 2);

    assertTrue(actual);

  }

  @Test
  void testIsDivisiblePixelSizeIsZero() {

    assertThrows(ArithmeticException.class,
            () -> task4.isDivisible(10, 0));

  }

  @Test
  void testIsDivisibleWallLengthSizeIsZero() {

    assertThrows(IllegalArgumentException.class,
            () -> task4.isDivisible(0, 10));

  }

}