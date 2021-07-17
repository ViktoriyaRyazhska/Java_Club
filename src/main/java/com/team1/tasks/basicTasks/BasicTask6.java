package com.team1.tasks.basicTasks;


import com.team1.IRunTask;

import java.util.Scanner;

public class BasicTask6 implements IRunTask {

    private int n;
    Scanner sc;
    public BasicTask6(Scanner sc) {
        this.sc = sc;
    }

    public static int toBinary(int n) {

        n = Integer.parseInt(Integer.toBinaryString(n));

        return n;
    }

    @Override
    public void execute() {
        boolean mark = false;
        System.out.println("Input integer number to convert to binary!");
        do {
            try {
                n = sc.nextInt();
                mark = true;
            } catch (Exception exception) {
                System.out.println("You have input illegal character, try again!");
                continue;
            }
        } while (mark == false);
        System.out.println(toBinary(n));

    }
}
