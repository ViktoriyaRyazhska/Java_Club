package com.team1.tasks.conditionsTasks;

import com.team1.IRunTask;

public class ConvertBoolToString implements IRunTask {
    public ConvertBoolToString() {
        //No args constructor
    }

    public static String convert(boolean b) {
        if (b) {
            return "true";
        } else {
            return "false";
        }
    }

    @Override
    public void execute() {
        System.out.println(convert(true));
    }
}
