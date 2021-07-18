import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task16Test {

  @Test
  void testFightWinnerFirstFighter() {

    Fighter ihor = new Fighter("Ihor", 5000, 500);
    Fighter max = new Fighter("Max", 2000, 700);

    String expected = "Ihor";

    String actual = task16.declareWinner(ihor, max, "Ihor");

    assertEquals(expected, actual);

  }

  @Test
  void testFightWinnerSecondFighter() {

    Fighter ihor = new Fighter("Ihor", 2000, 500);
    Fighter max = new Fighter("Max", 5000, 700);

    String expected = "Max";

    String actual = task16.declareWinner(ihor, max, "Ihor");

    assertEquals(expected, actual);

  }

  @Test
  void testFightWinnerThrows() {

    Fighter ihor = new Fighter("Ihor", -100, 500);
    Fighter max = new Fighter("Max", -100, 700);

    assertThrows(RuntimeException.class,
            () -> task16.declareWinner(ihor, max, "Ihor"));

  }

}