import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

  @Test
  void testGetTotalArea() {

    double expected = 1764.16;

    double actual = new Calculator().getTotalArea(
            new Circle(10),
            new Rectangle(15, 20),
            new Square(25),
            new Triangle(30, 35)
    );

    assertEquals(expected, actual, 1e-9);

  }
}