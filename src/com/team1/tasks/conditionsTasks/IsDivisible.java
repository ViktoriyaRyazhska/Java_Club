package com.team1.tasks.conditionsTasks;

public class IsDivisible {
    private IsDivisible() {
    }

    public static boolean isDivisible(long n, long x, long y) {
        return n % x == 0 && n % y == 0;
    }
}
