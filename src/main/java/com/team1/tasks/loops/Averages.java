package com.team1.tasks.loops;

import java.util.Arrays;

public class Averages {
    private Averages() {
    }

    public static int getAverage(int[] marks) {
        return Arrays.stream(marks).sum() / marks.length;
    }
}
