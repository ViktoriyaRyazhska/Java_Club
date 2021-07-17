import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task41Test {

  @Test
  void fixTheMeerkat() {
    assertArrayEquals(new String[] {"tail", "body", "head"}, task41.fixTheMeerkat(new String[] {"head", "body", "tail"}));
  }
}