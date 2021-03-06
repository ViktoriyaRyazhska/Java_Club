package com.company.basicTasks;

import com.company.IRunTask;

import java.util.Scanner;

public class BasicTask6 implements IRunTask {

    private int n;

    public static int toBinary(int n) {

        n = Integer.parseInt(Integer.toBinaryString(n));

        return n;
    }

    public BasicTask6() {
    }

    @Override
    public void execute() {
        boolean mark = false;
        System.out.println("Input integer number to convert to binary!");
        do {
            try {
                Scanner sc = new Scanner(System.in);
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
