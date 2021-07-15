package com.team1.tasks.loops;

public class ReversedSequence {
    private ReversedSequence() {
    }

    public static int[] reverse(int n) {
        //your code
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr.length - i;
        }
        return arr;
    }
}
