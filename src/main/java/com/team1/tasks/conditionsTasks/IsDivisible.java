package com.team1.tasks.conditionsTasks;

import com.team1.IRunTask;

import java.util.Scanner;

public class IsDivisible implements IRunTask {


    private long n;
    private long x;
    private long y;


    Scanner sc;

    public IsDivisible(Scanner sc) {
        this.sc = sc;
    }

    public static boolean isDivisible(long n, long x, long y) {
        return n % x == 0 && n % y == 0;
    }

    @Override
    public void execute() {
        boolean mark = false;
        System.out.println("Input three numbers to find divisible");
        do {
            try {
                System.out.println("Input first number");
                n = sc.nextInt();
                System.out.println("Input second number");
                x = sc.nextInt();
                System.out.println("Input third number");
                x = sc.nextInt();
                mark = true;
            } catch (Exception exception) {
                System.out.println("You have input illegal character, try again!");
                continue;
            }
        } while (mark == false);


        System.out.println(isDivisible(n,x,y));
    }
}
