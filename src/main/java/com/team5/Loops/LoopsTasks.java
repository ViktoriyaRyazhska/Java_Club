package com.team5.Loops;

import com.team5.Menu.Input;

public class LoopsTasks {
    public int task13() {
        System.out.println("That is the program that finds the summation of every number from 1 to number that you will write");
        int n = Input.getIntegerInput();
        int result = 0;
        for (int i = 1; i <= n; i++){
            result += i;
        }
        System.out.println(result);
        return result;
    }

    //tam jopa
    //i need help
    public long[] task14(){
        System.out.println("Im stupid");
//        int g = Input.getIntegerInput();
//        int m = Input.getIntegerInput();
//        int n = Input.getIntegerInput();

        long[] result = new long[0];
        System.out.println(result);
        return result;
    }

    public int task15(){
        System.out.println("In this game, there are 21 sticks lying in a pile. Players take turns taking 1, 2, or 3 sticks. " +
                "The last person to take a stick wins. \n" +
                "That is the robot that will always win the game. Robot will always go first. \n" +
                "Enter the number of sticks, and robot will win.........");
        int sticks = Input.getIntegerInput();
        int result = sticks % 4 == 0 ? 1 : sticks % 4;
        System.out.println(result);
        return result;
    }
}
