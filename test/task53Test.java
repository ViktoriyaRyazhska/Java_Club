import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task53Test {

  @Test
  void testSayHello() {

    String expected = "Hello, Ihor Volianskyi! Welcome to Austin, Texas";
    String actual = new task53().sayHello(new String[] {"Ihor", "Volianskyi"} , "Austin", "Texas");

    assertEquals(expected, actual);
  }
}