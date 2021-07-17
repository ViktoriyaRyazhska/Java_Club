package com.team1.tasks.loops;

import com.team1.IRunTask;

import java.util.Scanner;

public class StringRepeater implements IRunTask {

    private int repeat;
    private String string;

    Scanner sc;

    public StringRepeater(Scanner sc) {
        this.sc = sc;
    }

    public static String repeatStr(final int repeat, final String string) {
        return String.valueOf(string).repeat(Math.max(0, repeat));
    }

    @Override
    public void execute() {
        boolean mark = false;
        System.out.println("String repeat");
        int b;
        do {
            try {
                System.out.println("Input number of repeats");
                repeat = sc.nextInt();
                System.out.println("Input word to repeat");
                string = sc.next();
                mark = true;
            } catch (Exception exception) {
                System.out.println("You have input illegal character, try again!");
                continue;
            }
        } while (mark == false);
        System.out.println(repeatStr(repeat,string));
    }
}
