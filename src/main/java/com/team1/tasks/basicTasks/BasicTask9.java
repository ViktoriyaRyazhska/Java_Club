package com.team1.tasks.basicTasks;


import com.team1.IRunTask;

import java.util.Scanner;

public class BasicTask9 implements IRunTask {

    private int x;
    Scanner sc;
    public BasicTask9(Scanner sc) {
        this.sc = sc;
    }

    public static int makeNegative(final int x) {
        if (x < 0) {
            return x;
        }
        return x * -1;
    }

    @Override
    public void execute() {
        boolean mark = false;
        System.out.println("Input integer number to make it negative!");
        do {

            try {
                x = sc.nextInt();
                if (x > 0 || x == 0) {
                    mark = false;
                    System.out.println("You have input negative number or 0, try again!");
                } else {
                    mark = true;
                }
            } catch (Exception exception) {
                System.out.println("You have input illegal character, try again!");
                continue;
            }

        } while (mark == false);
        System.out.println(makeNegative(x));

    }
}
