import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task24Test {

  @Test
  void testBasicAdd() {

    Integer expected = 10;

    Integer actual = task24.basicMath("+", 5, 5);

    assertEquals(expected, actual);

  }

  @Test
  void testBasicSubtract() {

    Integer expected = 10;

    Integer actual = task24.basicMath("-", 20, 10);

    assertEquals(expected, actual);

  }

  @Test
  void testBasicMultiply() {

    Integer expected = 100;

    Integer actual = task24.basicMath("*", 10, 10);

    assertEquals(expected, actual);

  }

  @Test
  void testBasicDivide() {

    Integer expected = 5;

    Integer actual = task24.basicMath("/", 10, 2);

    assertEquals(expected, actual);

  }


  @Test
  void testDivideByZero() {

    assertThrows(ArithmeticException.class,
            () -> task24.basicMath("/", 10, 0));

  }

  @Test
  void testBasicMathWithUnsupportedOperation() {

    Integer expected = 0;

    Integer actual = task24.basicMath("^", 10, 0);

    assertEquals(expected, actual);

  }
}