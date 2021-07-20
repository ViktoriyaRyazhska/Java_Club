package com.team1.tasks.basicTasks;


import com.team1.IRunTask;

import java.util.Scanner;

public class BasicTask7 implements IRunTask {

    private int h;
    private int m;
    private int s;
    Scanner sc;
    public BasicTask7(Scanner sc) {
        this.sc = sc;
    }

    public static int Past(int h, int m, int s) {
        return h * 3600000 + (m * 60000 + (s * 1000));
    }

    @Override
    public void execute() {
        boolean mark = false;
        System.out.println("Input to integer number to check divisible!");
        do {
            try {
                System.out.println("Input hours!");
                h = sc.nextInt();
                System.out.println("Input minutes!");
                m = sc.nextInt();
                System.out.println("Input seconds!");
                s = sc.nextInt();
                mark = true;
            } catch (Exception exception) {
                System.out.println("You have input illegal character, try again!");
                continue;
            }
        } while (mark == false);
        System.out.println(Past(h, m, s));
    }
}
