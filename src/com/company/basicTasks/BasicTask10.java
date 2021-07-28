package com.company.basicTasks;

import com.company.IRunTask;

import java.util.Scanner;

public class BasicTask10 implements IRunTask {

    private int age;

    public BasicTask10() {
    }

    public static String datingRange(int age) {
        String res = "";
        int min;
        int max;
        if (age > 14) {
            min = (age / 2) + 7;
            max = (age - 7) * 2;
            res = String.format("%d-%d", min, max);
        } else {

            min = age - (int) Math.ceil(age / 10) + 1;
            System.out.println(min);
            max = age + (int) Math.ceil(age / 10) + 1;
            System.out.println(max);
            res = String.format("%d-%d", min, max);
            System.out.println(res);

        }
        return res;
    }

    @Override
    public void execute() {
        boolean mark = false;
        System.out.println("Input to integer age to find min and max!");
        do {
            try {
                Scanner sc = new Scanner(System.in);
                age = sc.nextInt();
                mark = true;
            } catch (Exception exception) {
                System.out.println("You have input illegal character, try again!");
                continue;
            }
        } while (mark == false);
        System.out.println(datingRange(age));

    }
}
