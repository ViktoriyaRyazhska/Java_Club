import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task52Test {

  @Test
  void testReverseString() {

    String expected = "olleH";

    String actual = task52.solution("Hello");

    assertEquals(expected, actual);

  }
}