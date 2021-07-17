package com.team1.tasks.loops;

import com.team1.IRunTask;

import java.util.Arrays;
import java.util.Scanner;

public class Averages implements IRunTask {

    Scanner sc;
    public Averages(Scanner sc) {
        this.sc = sc;

    }

    private int []marks;


    public static int getAverage(int[] marks) {
        return Arrays.stream(marks).sum() / marks.length;
    }

    @Override
    public void execute() {
        boolean mark = false;
        int size,number;
        System.out.println("Input array of marks to get it average");
        do {
            try {
                System.out.println("Input array size");
                size = sc.nextInt();
                System.out.println("Input marks");
                for (int i = 0; i <size; i++) {
                    number = sc.nextInt();
                    marks[i]= number;
                }

                mark = true;
            } catch (Exception exception) {
                System.out.println("You have input illegal character, try again!");
                continue;
            }
        } while (mark == false);
        System.out.println(getAverage(marks));

    }
}
