import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task57Test {

  @Test
  void testNoSpace() {

    String expected = "HelloFromTesting";

    String actual = task57.noSpace("Hello From Testing");

    assertEquals(expected, actual);

  }
}