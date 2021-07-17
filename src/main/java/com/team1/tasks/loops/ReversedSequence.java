package com.team1.tasks.loops;

import com.team1.IRunTask;

import java.util.Arrays;
import java.util.Scanner;

public class ReversedSequence implements IRunTask {
    Scanner sc;
    private int n;
    public ReversedSequence(Scanner sc) {
        this.sc = sc;
    }

    public static int[] reverse(int n) {
        //your code
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr.length - i;
        }
        return arr;
    }

    @Override
    public void execute() {
        boolean mark = false;
        System.out.println("Reverse of array ");
        do {
            try {
                System.out.println("Input array size");
                n = sc.nextInt();
                mark = true;
            } catch (Exception exception) {
                System.out.println("You have input illegal character, try again!");
                continue;
            }
        } while (mark == false);
        System.out.println(Arrays.toString(reverse(n)));
    }
}
