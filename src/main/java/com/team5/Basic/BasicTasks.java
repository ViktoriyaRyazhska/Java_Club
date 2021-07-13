package com.team5.Basic;

public class BasicTasks {

    public int task1(int i) {
        int result = i*i;
        System.out.println(result);
        return result;
    }

    public int task7(int h, int m, int s){
        int result = (h * 360000) + (m * 60000) + (s * 1000);
        System.out.println(result);
        return result;
    }
}
