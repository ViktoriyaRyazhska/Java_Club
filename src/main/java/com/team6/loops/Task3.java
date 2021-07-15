package com.team6.loops;

class Task3 {
    public static int getAverage(int[] marks){
        int average = 0;
        for (int i : marks){
            average += i;
        }
        return average/ marks.length;
    }
}
