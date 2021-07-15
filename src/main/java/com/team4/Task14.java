//Task 14 (Fractions class)
package com.team4;
import static java.math.BigInteger.valueOf;

class Task14 {
  final long top;
  final long bottom;

  Task14(long numerator, long denominator) {
    long gcd = valueOf(numerator).gcd(valueOf(denominator)).longValue();
    top = numerator / gcd;
    bottom = denominator / gcd;
  }

  Task14 add(Task14 f2) {
    return new Task14(top * f2.bottom + f2.top * bottom, bottom * f2.bottom);
  }

  @Override
  public String toString() {
    return top + "/" + bottom;
  }

  @Override
  public boolean equals(Object o) {
    return top * ((Task14) o).bottom == ((Task14) o).top * bottom;
  }
}
