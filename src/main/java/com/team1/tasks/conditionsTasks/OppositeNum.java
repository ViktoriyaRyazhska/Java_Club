package com.team1.tasks.conditionsTasks;

import com.team1.IRunTask;

import java.util.Scanner;

public class OppositeNum implements IRunTask {

    Scanner sc;

    private  int number;
    public OppositeNum(Scanner sc) {
        this.sc = sc;
    }

    public static int opposite(int number) {
        int opposite = 0;
        if (number < 0) {
            opposite = number + (number * 2);
            return opposite;
        } else if (number == 0) return opposite;
        else {
            opposite = number - (number * 2);
            return opposite;
        }
    }

    @Override
    public void execute() {

        boolean mark = false;
        System.out.println("Input number to get it opposite");
        do {
            try {
                System.out.println("Input number");
                number = sc.nextInt();

                mark = true;
            } catch (Exception exception) {
                System.out.println("You have input illegal character, try again!");
                continue;
            }
        } while (mark == false);
        System.out.println(opposite(number));
    }
}
