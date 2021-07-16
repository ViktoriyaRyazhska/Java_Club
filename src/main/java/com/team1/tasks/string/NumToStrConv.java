package com.team1.tasks.string;

import com.team1.IRunTask;

public class NumToStrConv implements IRunTask {
    public static String numberToString(int num) {
        return Integer.toString(num);
    }

    @Override
    public void execute() {
        System.out.println(numberToString(6));
    }
}
