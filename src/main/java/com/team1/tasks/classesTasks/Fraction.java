package com.team1.tasks.classesTasks;

import com.team1.IRunTask;

import java.util.Scanner;

public class Fraction implements Comparable<Fraction>, IRunTask {
    private long top;
    private long bottom;


    public Fraction(long numerator, long denominator) {
        top = numerator;
        bottom = denominator;
    }

    public Fraction() {
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
    public void execute() {
        boolean mark = false;
        int size, number;
        Scanner sc = new Scanner(System.in);
        Fraction faraction1;
        Fraction faraction2;
        System.out.println("Input two fraction to get it sum");
        do {
            try {
                System.out.println("Input first fraction");
                System.out.println("Input top number");

                top = sc.nextInt();
                System.out.println("Input bottom number");
                bottom = sc.nextInt();
                faraction1 = new Fraction(top, bottom);
                System.out.println("Input second fraction");
                System.out.println("Input top number");

                top = sc.nextInt();
                System.out.println("Input bottom number");
                bottom = sc.nextInt();
                faraction2 = new Fraction(top, bottom);
                System.out.println(faraction1.add(faraction2).toString());
                mark = true;
            } catch (Exception exception) {
                System.out.println("You have input illegal character, try again!");
                continue;
            }
        } while (mark == false);

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
