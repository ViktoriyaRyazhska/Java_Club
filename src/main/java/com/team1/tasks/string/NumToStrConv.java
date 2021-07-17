package com.team1.tasks.string;

import com.team1.IRunTask;

import java.util.Scanner;

public class NumToStrConv implements IRunTask {

    Scanner sc;
    private  int num;

    public NumToStrConv(Scanner sc) {
        this.sc = sc;
    }

    public static String numberToString(int num) {
        return Integer.toString(num);
    }

    @Override
    public void execute() {
        boolean mark = false;
        int size,number;
        System.out.println("Convert int to String");
        do {
            try {
                System.out.println("Input number");
                num = sc.nextInt();
                mark = true;
            } catch (Exception exception) {
                System.out.println("You have input illegal character, try again!");
                continue;
            }
        } while (mark == false);
        System.out.println(numberToString(num));


    }
}
