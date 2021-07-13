package com.company.basicTasks;

import com.company.IRunTask;

import java.util.Scanner;

public class BasicTask9 implements IRunTask {

    private int x;

    public static int makeNegative(final int x) {
        if (x < 0) {
            return x;
        }
        return x * -1;
    }

    public BasicTask9() {
    }

    @Override
    public void execute() {
        boolean mark = false;
        System.out.println("Input integer number to make it negative!");
        do {

            try {
                Scanner sc = new Scanner(System.in);
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
