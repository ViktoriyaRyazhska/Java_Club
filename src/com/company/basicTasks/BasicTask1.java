package com.company.basicTasks;

import com.company.IRunTask;

import java.util.Scanner;

public class BasicTask1 {

    private int i;

    public BasicTask1() {
    }

    public void setI(int i) {
        this.i = i;
    }

    public static int doubleInteger(int i) {
        return i * 2;
    }

    public int getI() {
        return i;
    }

    public void execute() {
        boolean mark = false;
        System.out.println("Input integer number you want to double!");
        do{
            try {
                Scanner sc = new Scanner(System.in);
                i = sc.nextInt();
                mark = true;
            } catch (Exception exception) {
                System.out.println("You have input illegal character, try again!");
                continue;
            }
        } while (mark == false);

        System.out.println(doubleInteger(i));

    }

}
