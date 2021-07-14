package com.team1.tasks.string;

public class StringReverser {
    private StringReverser() {
    }

    public static String solution(String str) {
        StringBuilder sb = new StringBuilder();
        return sb.append(str).reverse().toString();
    }
}
