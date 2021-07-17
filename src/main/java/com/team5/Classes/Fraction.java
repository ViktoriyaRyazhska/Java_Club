package com.team5.Classes;

public class Fraction implements Comparable<Fraction>
{
    private final long top;
    private final long bottom;

    public Fraction(long numerator, long denominator) {
        top = numerator;
        bottom = denominator;
    }

    @Override
    public int hashCode() { return 17 * Long.hashCode(top) + Long.hashCode(bottom); }
    @Override
    public boolean equals(Object o) { return compareTo((Fraction)o) == 0; }
    @Override
    public int compareTo(Fraction f2){ return Long.compare(top * f2.bottom, f2.top * bottom); }

    // Your work here!
    public long getTop() {
        return top;
    }

    public long getBottom() {
        return bottom;
    }

    //Add two fractions
    public Fraction add(Fraction f2) {
        System.out.println("Your task is to make this class string representable, and addable while keeping the result in the minimum representation possible."
        + "You are provided with a skeleton of the class 'Fraction', which accepts two arguments (numerator, denominator).");
        long newNumerator = (getBottom() == f2.getBottom()) ? getTop() + f2.getTop()  : getTop() * f2.getBottom() + f2.getTop() * getBottom();
        long newDenominator = (getBottom() == f2.getBottom()) ? getBottom() : getBottom() * f2.getBottom();

        long g = gcd(newNumerator, newDenominator);
        newNumerator /= g;
        newDenominator /= g;

        Fraction newFr = new Fraction(newNumerator, newDenominator);
        System.out.println(newFr);
        return newFr;
    }

    public long gcd(long a, long b) {
        if(b==0) return a;
        return gcd(b, a%b);
    }


    @Override
    public String toString() {
        return "Fraction{" +
                "top=" + top +
                ", bottom=" + bottom +
                '}';
    }
}
