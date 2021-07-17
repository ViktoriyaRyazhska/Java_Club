package com.team1.tasks.string;

import com.team1.IRunTask;

import java.util.Scanner;

public class OppositeNumStr implements IRunTask {
    Scanner sc;

    private int number;
    public OppositeNumStr(Scanner sc) {
        this.sc = sc;
    public OppositeNumStr() {
        //no args
    }

    public static int opposite(int number) {
        return -number;
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
