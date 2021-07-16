package com.team1.tasks.loops;

import com.team1.IRunTask;

public class StringRepeater  implements IRunTask {
    public StringRepeater() {
        //no args
    }

    public static String repeatStr(final int repeat, final String string) {
        return String.valueOf(string).repeat(Math.max(0, repeat));
    }

    @Override
    public void execute() {
        System.out.println(repeatStr(4,"string"));
    }
}
