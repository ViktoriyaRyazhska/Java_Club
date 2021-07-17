import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Tests to task#60")
class task60Test {

  @Test
  @DisplayName("test convert fake binary code")
  void testFakeBin() {

    String expected = "0100100001100101";

    String actual = task60.fakeBin("3623742328841829");

    assertEquals(expected, actual);

  }

  @Test
  @DisplayName("test convert to binary empty string")
  void testFakeBinWithEmptyString() {

    assertThrows(IllegalArgumentException.class,
            () -> task60.fakeBin(""),
            "This string is empty. There is nothing to convert!");

  }
}