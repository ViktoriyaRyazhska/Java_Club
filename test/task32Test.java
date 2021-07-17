import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Tests to task#32")
class task32Test {

  @Test
  void testRepeatString() {

    String expected = "TestTestTestTest";

    String actual = task32.repeatStr(4, "Test");

    assertEquals(expected, actual);

  }

  @Test
  void testRepeatEmptyString() {

    assertThrows(IllegalArgumentException.class,
            () -> task32.repeatStr(4, ""),
            "String is empty. Nothing to repeat.");

  }
}