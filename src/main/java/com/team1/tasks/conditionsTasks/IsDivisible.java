package com.team1.tasks.conditionsTasks;

import com.team1.IRunTask;

public class IsDivisible implements IRunTask {
    public IsDivisible() {
        //No args constructor
    }

    public static boolean isDivisible(long n, long x, long y) {
        return n % x == 0 && n % y == 0;
    }

    @Override
    public void execute() {
        System.out.println( isDivisible(5,2,3));
    }
}
