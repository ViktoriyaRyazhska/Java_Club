import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task37Test {

  @Test
  void testReverse() {

    int[] expected = new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

    int[] actual = task37.reverse(10);

    assertArrayEquals(expected, actual);

  }


  @Test
  void testReverseWithZero() {

    int[] expected = new int[] {};

    int[] actual = task37.reverse(0);

    assertArrayEquals(expected, actual);

  }

  @Test
  void testReverseWithNegativeValue() {
    assertThrows(IllegalArgumentException.class, () -> task37.reverse(-1));
  }
}