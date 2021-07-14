package com.team1.tasks.loops;

public class StringRepeater {
    private StringRepeater() {
    }

    public static String repeatStr(final int repeat, final String string) {
        return String.valueOf(string).repeat(Math.max(0, repeat));
    }
}
