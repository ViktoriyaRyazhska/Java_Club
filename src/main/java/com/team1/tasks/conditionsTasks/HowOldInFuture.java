package com.team1.tasks.conditionsTasks;

import com.team1.IRunTask;

public class HowOldInFuture implements IRunTask {
    public HowOldInFuture() {
        //no args
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
        System.out.println( calculateAge(2002,2077));
    }
}
