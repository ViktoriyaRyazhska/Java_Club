import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FractionTest {

  @Test
  void testAddFractions() {

    Fraction expected = new Fraction(16, 12);

    Fraction fraction1 = new Fraction(2, 4);
    Fraction fraction2 = new Fraction(5, 6);

    Fraction actual = fraction1.add(fraction2);

    assertEquals(expected, actual);

  }
}