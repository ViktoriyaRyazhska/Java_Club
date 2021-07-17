package com.team1.tasks.conditionsTasks;

import com.team1.IRunTask;

import java.util.Scanner;

public class HowOldInFuture implements IRunTask {

    Scanner sc;
    private int birth;
    private int yearTo;

    public HowOldInFuture(Scanner sc) {
        this.sc = sc;
    }

    public static String calculateAge(int birth, int yearTo) {
        if (yearTo - birth == 1) {
            return "You are 1 year old.";
        } else if (birth - yearTo == 1) {
            return "You will be born in 1 year.";
        } else if (birth == yearTo) {
            return "You were born this very year!";
        } else if (birth < yearTo) {
            return "You are " + (yearTo - birth) + " years old.";
        } else {
            return "You will be born in " + (birth - yearTo) + " years.";
        }
    }

    @Override
    public void execute() {
        boolean mark = false;
        System.out.println("Input your age and future date to get your future age ");
        do {
            try {
                System.out.println("Input age");
                birth = sc.nextInt();
                System.out.println("Input year, format 2XXX");
                yearTo = sc.nextInt();
                mark = true;
            } catch (Exception exception) {
                System.out.println("You have input illegal character, try again!");
                continue;
            }
        } while (mark == false);
        System.out.println(calculateAge(birth, yearTo));
    }
}
