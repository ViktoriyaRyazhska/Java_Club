import java.util.Scanner;

import static java.math.BigInteger.valueOf;
public class task14 {
    public static void execute(Scanner sc) {
        System.out.println("This method adds fractions.");
        System.out.println("Enter numerator of first fraction: ");
        int numeratorF1 = sc.nextInt();
        System.out.println("Okay, now enter denominator of first fraction: ");
        int denominatorF1 = sc.nextInt();
        System.out.println("Enter numerator of second fraction: ");
        int numeratorF2 = sc.nextInt();
        System.out.println("Okay, now enter denominator of second fraction: ");
        int denominatorF2 = sc.nextInt();
        Fraction f1 = new Fraction(numeratorF1, denominatorF1);
        Fraction f2 = new Fraction(numeratorF2, denominatorF2);
        Fraction result = f1.add(f2);
        System.out.println("Your result: " + result);
    }

    private static long gcd(long x, long y) {
        return x % y > 0 ? gcd(y, x % y) : y;
    }
}
class Fraction implements Comparable<Fraction> {
    private final long top;
    private final long bottom;

    public Fraction(long numerator, long denominator) {
        long gcd = valueOf(numerator).gcd(valueOf(denominator)).longValue();
        top = numerator / gcd;
        bottom = denominator / gcd;
    }

    @Override
    public int hashCode() { return 17 * Long.hashCode(top) + Long.hashCode(bottom); }
    @Override
    public boolean equals(Object o) { return compareTo((Fraction)o) == 0; }
    @Override
    public int compareTo(Fraction f2){ return Long.compare(top * f2.bottom, f2.top * bottom); }

    // Your work here!


    //Add two fractions
    public Fraction add(Fraction f2) {
        long numer = this.top * f2.bottom + f2.top * this.bottom;
        long denom = this.bottom * f2.bottom;
        return new Fraction(numer, denom);
    }

    //...and make this class string representable
    @Override
    public String toString() {
        return top + "/" + bottom;
    }
}
