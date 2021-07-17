package com.team1.tasks.classesTasks;

import com.team1.IRunTask;

import java.util.Scanner;

public class StaticElectrickery implements IRunTask {
    private final int value;
    private final int ONE_HUNDRED = 100;
    private int n;
    Scanner sc;

    public StaticElectrickery(Scanner sc ) {
        value = ONE_HUNDRED;
    }


    public int plus100(int n) {
        return value + n;
    }

    @Override
    public void execute() {
        boolean mark = false;
        System.out.println("Number +100");
        do {
            try {
                System.out.println("Input number");
                n = sc.nextInt();
                mark = true;
            } catch (Exception exception) {
                System.out.println("You have input illegal character, try again!");
                continue;
            }
        } while (mark == false);
        System.out.println(plus100(n));
    }
}
