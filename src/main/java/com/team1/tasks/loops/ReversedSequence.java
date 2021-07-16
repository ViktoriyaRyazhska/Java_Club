package com.team1.tasks.loops;

import com.team1.IRunTask;

import java.util.Arrays;

public class ReversedSequence implements IRunTask {
    public ReversedSequence() {
        //no args
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
        System.out.println(Arrays.toString(reverse(5)));
    }
}
