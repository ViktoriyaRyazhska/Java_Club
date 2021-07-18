import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task23Test {

  @Test
  void testRPSFirstPlayerWin() {

    String expected = "Player 1 won!";

    assertEquals(expected, task23.rps("paper", "rock"));
    assertEquals(expected, task23.rps("scissors", "paper"));
    assertEquals(expected, task23.rps("rock", "scissors"));

  }
  @Test
  void testRPSSecondPlayerWin() {

    String expected = "Player 2 won!";

    assertEquals(expected, task23.rps("rock", "paper"));
    assertEquals(expected, task23.rps("paper", "scissors"));
    assertEquals(expected, task23.rps("scissors", "rock"));

  }
  @Test
  void testRPSDraw() {

    String expected = "Draw!";

    assertEquals(expected, task23.rps("paper", "paper"));
    assertEquals(expected, task23.rps("rock", "rock"));
    assertEquals(expected, task23.rps("scissors", "scissors"));

  }
}