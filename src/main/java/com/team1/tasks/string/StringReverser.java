package com.team1.tasks.string;

import com.team1.IRunTask;

public class StringReverser implements IRunTask {
    public StringReverser() {
        //no args
    }

    public static String solution(String str) {
        StringBuilder sb = new StringBuilder();
        return sb.append(str).reverse().toString();
    }

    @Override
    public void execute() {
        System.out.println(solution("Hello"));
    }
}
