package com.team1.tasks;

public class Fraction implements Comparable<Fraction> {
    private final long top;
    private final long bottom;

    public Fraction(long numerator, long denominator) {
        top = numerator;
        bottom = denominator;
    }

    @Override
    public int hashCode() {
        return 17 * Long.hashCode(top) + Long.hashCode(bottom);
    }

    @Override
    public boolean equals(Object o) {
        return compareTo((Fraction) o) == 0;
    }

    @Override
    public int compareTo(Fraction f2) {
        return Long.compare(top * f2.bottom, f2.top * bottom);
    }

    public Fraction add(Fraction f2) {
        Fraction r;
        if (bottom == f2.bottom) {
            r = new Fraction(top + f2.top, bottom);
        } else {
            long bot = bottom * f2.getBottom();
            long tp = (top * f2.getBottom()) + (f2.getTop() * bottom);
            if (bot % 2 == 0 && tp % 2 == 0) {
                tp = tp / 2;
                bot = bot / 2;
            }
            r = new Fraction(tp, bot);
        }
        return r;
    }

    @Override
    public String toString() {
        return top + "/" + bottom;
    }

    public long getTop() {
        return top;
    }

    public long getBottom() {
        return bottom;
    }
}
