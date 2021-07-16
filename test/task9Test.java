import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task9Test {

  @Test
  void makeNegativeWithPositiveNumber() {

    int expected = -1;

    int actual = task9.makeNegative(1);

    assertEquals(expected, actual);
    
  }

  @Test
  void makeNegativeWithNegativeNumber() {

    int expected = -1;

    int actual = task9.makeNegative(-1);

    assertEquals(expected, actual);

  }

  @Test
  void makeNegativeWithZero() {

    assertThrows(IllegalArgumentException.class,
            () -> task9.makeNegative(0),
            "Zero cant be negative");

  }


}