//Task 14 (Fractions class)

import static java.math.BigInteger.valueOf;

class Fraction {
  final long top;
  final long bottom;

  Fraction(long numerator, long denominator) {
    long gcd = valueOf(numerator).gcd(valueOf(denominator)).longValue();
    top = numerator / gcd;
    bottom = denominator / gcd;
  }

  Fraction add(Fraction f2) {
    return new Fraction(top * f2.bottom + f2.top * bottom, bottom * f2.bottom);
  }

  @Override
  public String toString() {
    return top + "/" + bottom;
  }

  @Override
  public boolean equals(Object o) {
    return top * ((Fraction) o).bottom == ((Fraction) o).top * bottom;
  }
}
