import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Tests to task#59")
class task59Test {

  @Test
  void testPosition() {

    String expected = "Position of alphabet: 3";

    String actual = task59.position("c".charAt(0));

    assertEquals(expected, actual);

  }

  @Test
  @DisplayName("test position with wrong value")
  void testPositionWithWrongValue() {

    assertThrows(IllegalArgumentException.class,
            () -> task59.position('3'),
            "This symbol is not a lowercase letter!");

  }
}