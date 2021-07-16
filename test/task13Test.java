import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task13Test {

  @Test
  void testPlus100() {

    int expected = 101;

    int actual = task13.INST.plus100(1);

    assertEquals(expected, actual);

  }
}