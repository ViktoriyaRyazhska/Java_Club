package com.team1.tasks.basicTasks;


import java.util.Scanner;

public class BasicTask1 implements com.team1.IRunTask {

    private int i;
    Scanner sc;
    public BasicTask1(Scanner sc) {
        this.sc = sc;
    }

    public static int doubleInteger(int i) {
        return i * 2;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void execute() {
        boolean mark = false;
        System.out.println("Input integer number you want to double!");
        do {
            try {
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
