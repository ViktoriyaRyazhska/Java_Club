package com.team6.loops;

class Task1 {
    private static String repeatStr(final int repeat, final String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0 ; i < repeat ; i ++){
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }
}
