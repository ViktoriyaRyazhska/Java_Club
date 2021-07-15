package com.team1.tasks.loops;

import com.team1.IRunTask;

public class CatDogYearsCounter implements IRunTask {
    private CatDogYearsCounter() {
    }

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int catYears = 24;
        int dogYears = 24;
        if (humanYears == 1) {
            return new int[]{1, 15, 15};
        } else if (humanYears == 2) {
            return new int[]{2, 24, 24};
        } else {
            for (int i = 2; i < humanYears; i++) {
                catYears += 4;
                dogYears += 5;
            }
            return new int[]{humanYears, catYears, dogYears};
        }
    }

    @Override
    public void execute() {

    }
}