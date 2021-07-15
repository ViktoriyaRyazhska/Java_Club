package com.team1.tasks.conditionsTasks;

public class HowOldInFuture {
    private HowOldInFuture() {
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
}
