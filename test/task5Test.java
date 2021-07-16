import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task5Test {

  @Test
  void testGreet() {

    String expected = "Hello, Ihor!";

    String actual = task5.greet("Ihor");

    assertEquals(expected, actual);

  }


  @Test
  void testGreetJohnny() {

    String expected = "Hello, my love!";

    String actual = task5.greet("Johnny");

    assertEquals(expected, actual);

  }

}