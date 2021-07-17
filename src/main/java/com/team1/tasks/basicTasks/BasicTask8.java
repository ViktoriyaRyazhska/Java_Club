package com.team1.tasks.basicTasks;


import com.team1.IRunTask;

import java.util.Scanner;

public class BasicTask8 implements IRunTask {
    private int number;
    Scanner sc;
    public BasicTask8(Scanner sc) {
        this.sc = sc;
    }

    public static int century(int number) {
        return (number / 100) + 1;
    }

    @Override
    public void execute() {
        boolean mark = false;
        System.out.println("Input to integer year to convert to century!");
        do {
            try {
                number = sc.nextInt();
                mark = true;
            } catch (Exception exception) {
                System.out.println("You have input illegal character, try again!");
                continue;
            }
        } while (mark == false);
        System.out.println(century(number));
    }
}
