package com.team5.Basic;

public class BasicClass {

    public void doubleInteger(int i) {
        System.out.println("Enter your number");
        int result = i*i;
        System.out.println(result);
    }

    public int task7(int h, int m, int s){
        System.out.println("Enter the hours, minutes, and seconds to convert them to milliseconds");
        int result = (h * 360000) + (m * 60000) + (s * 1000);
        System.out.println(result);
        return result;
    }
}
