package com.team1.tasks.conditionsTasks;

import com.team1.IRunTask;

public class IsDivisible implements IRunTask {
    private IsDivisible() {
    }

    public static boolean isDivisible(long n, long x, long y) {
        return n % x == 0 && n % y == 0;
    }

    @Override
    public void execute() {

    }
}
