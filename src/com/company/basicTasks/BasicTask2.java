package com.company.basicTasks;

import com.company.IRunTask;

import java.util.Scanner;

public class BasicTask2 implements IRunTask {

    private int num1;
    private int num2;

    public BasicTask2() {
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public void execute() {
        boolean mark = false;
        System.out.println("Input integer number you want to multiply!");
        do{
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Input first number!");
                num1 = sc.nextInt();
                System.out.println("Input second number!");
                num2 = sc.nextInt();
                mark = true;
            } catch (Exception exception) {
                System.out.println("You have input illegal character, try again!");
                continue;
            }
        } while (mark == false);
        System.out.println(multiply(num1, num2));
    }

}
