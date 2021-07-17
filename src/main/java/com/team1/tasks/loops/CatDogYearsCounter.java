package com.team1.tasks.loops;

import com.team1.IRunTask;

import java.util.Arrays;
import java.util.Scanner;

public class CatDogYearsCounter implements IRunTask {
    Scanner sc;

    private int humanYears;

    public CatDogYearsCounter(Scanner sc) {
        this.sc = sc;
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
        boolean mark = false;
        System.out.println("Input human age to get cat, dog equal");
        do {
            try {
                System.out.println("Input human age");
                humanYears = sc.nextInt();
                mark = true;
            } catch (Exception exception) {
                System.out.println("You have input illegal character, try again!");
                continue;
            }
        } while (mark == false);
        System.out.println(Arrays.toString(humanYearsCatYearsDogYears(humanYears)));
    }
}