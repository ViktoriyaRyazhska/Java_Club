package com.team1.tasks.conditionsTasks;

import com.team1.IRunTask;

import java.util.Scanner;

public class MathOperations implements IRunTask {

    Scanner sc;

    private String op;
    private int v1;
    private int v2;

    public MathOperations(Scanner sc) {
        this.sc = sc;
    }
    public static Integer basicMath(String op, int v1, int v2) {
        switch (op) {
            case "+":
                return v1 + v2;
            case "-":
                return v1 - v2;
            case "/":
                if (v1 == 0 || v2 == 0) throw new IllegalArgumentException("Division by zero");
                else return v1 / v2;
            case "*":
                return v1 * v2;
            default:
                return 0;
        }
    }

    @Override
    public void execute() {
        boolean mark = false;
        System.out.println("Choose operation to calculate numbers");
        do {
            try {
                System.out.println("Input operation");
                op = sc.next();
                System.out.println("Input first number");
                v1 = sc.nextInt();
                System.out.println("Input second number");
                v2 = sc.nextInt();

                mark = true;
            } catch (Exception exception) {
                System.out.println("You have input illegal character, try again!");
                continue;
            }
        } while (mark == false);

        System.out.println(basicMath(op,v1,v2));
    }
}
