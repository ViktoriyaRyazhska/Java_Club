package com.company.basicTasks;

import com.company.IRunTask;

import java.util.Scanner;

public class BasicTask4 implements IRunTask {
    public BasicTask4() {
    }
    private int wallLength;
    private int pixelSize;

    public static boolean isDivisible(int wallLength, int pixelSize) {
        if(wallLength%pixelSize==0){
            return true;
        }
        return false;
    }

    @Override
    public void execute() {
        boolean mark = false;
        System.out.println("Input to integer number to check divisible!");
        do{
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Input first number!");
                wallLength = sc.nextInt();
                System.out.println("Input second number!");
                pixelSize = sc.nextInt();
                mark = true;
            } catch (Exception exception) {
                System.out.println("You have input illegal character, try again!");
                continue;
            }
        } while (mark == false);
        System.out.println(isDivisible(wallLength,pixelSize));
    }
}
