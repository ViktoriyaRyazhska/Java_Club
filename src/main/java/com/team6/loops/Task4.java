package com.team6.loops;

import java.util.Arrays;

class Task4 {
    public static int[] map(int[] arr) {
        for (int i = 0 ; i < arr.length; i++){
            arr[i] = arr[i] * 2;
        }
        return arr;
    }
}
