package com.team1.tasks.string;

import com.team1.IRunTask;

import java.util.Scanner;

public class StringReverser implements IRunTask {

    private String str;

    Scanner sc;
    public StringReverser(Scanner sc) {
        this.sc = sc;

    }

    public static String solution(String str) {
        StringBuilder sb = new StringBuilder();
        return sb.append(str).reverse().toString();
    }

    @Override
    public void execute() {

        boolean mark = false;
        int size,number;
        System.out.println("Input string to get it reverse");
        do {
            try {
                System.out.println("Input string");
                str= sc.next();

                mark = true;
            } catch (Exception exception) {
                System.out.println("You have input illegal character, try again!");
                continue;
            }
        } while (mark == false);
        System.out.println(solution(str));

    }
}
