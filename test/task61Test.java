import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task61Test {

  @Test
  void TestHowOld() {

    int expected = 3;

    int actual = task61.howOld("3 years old");

    assertEquals(expected, actual);
  }

  @Test
  void TestIfGirlsAgeLessThan2() {

    assertThrows(IllegalArgumentException.class, () -> task61.howOld("1 year old"), "She is too small to talking");

  }

  @Test
  void TestHowOldWithWrongArgument() {

    assertThrows(NumberFormatException.class, () -> task61.howOld("She is 5 years old"));

  }

}