package com.team6.loops;

class Task5 {
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int sheepsCounter = 0;
        for (boolean i : arrayOfSheeps){
            if (i){
                sheepsCounter++;
            }
        }
        return sheepsCounter;
    }
}
