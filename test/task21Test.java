import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task21Test {

  @Test
  void testBonusTimeTrue() {

    String expected = "£20000";

    String actual = task21.bonusTime(2000, true);

    assertEquals(expected, actual);

  }

  @Test
  void testBonusTimeFalse() {

    String expected = "£2000";

    String actual = task21.bonusTime(2000, false);

    assertEquals(expected, actual);

  }
}