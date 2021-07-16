package com.team1.tasks.loops;

import com.team1.IRunTask;

import java.util.Arrays;

public class Averages implements IRunTask {
    public Averages() {
        //no args
    }

    public static int getAverage(int[] marks) {
        return Arrays.stream(marks).sum() / marks.length;
    }

    @Override
    public void execute() {
        int[]array={1,2,6,4,3};
        System.out.println(getAverage(array));
    }
}
