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

  public static void execute(){
    System.out.println("Input your numerator and denominator ");
    long n21 = MyMain.scanner.nextLong();
    long n22 = MyMain.scanner.nextLong();
    Task14 f1 = new Task14(n21, n22);
    System.out.println("Do it again! ");
    long n23 = MyMain.scanner.nextLong();
    long n24 = MyMain.scanner.nextLong();
    Task14 f2 = new Task14(n23, n24);
    Task14 f3 = f1.add(f2);
    System.out.println(f3.toString());
    System.out.println("Input your object ");
    Object n25 = MyMain.scanner.next();
    System.out.println(f3.equals(n25));
  }
}
