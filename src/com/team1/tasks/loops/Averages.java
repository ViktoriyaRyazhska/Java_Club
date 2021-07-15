package com.team1.tasks.loops;

import com.team1.IRunTask;

import java.util.Arrays;

public class Averages implements IRunTask {
    private Averages() {
    }

    public static int getAverage(int[] marks) {
        return Arrays.stream(marks).sum() / marks.length;
    }

    @Override
    public void execute() {

    }
}
