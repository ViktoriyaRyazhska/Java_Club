package com.team6.loops;

class Task1 {
    private static String repeatStr(final int repeat, final String string) {
        String outLine = "";
        for (int i = 0 ; i < repeat ; i ++){
            outLine += string;
        }
        return outLine;
    }
}
