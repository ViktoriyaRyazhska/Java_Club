package com.team5.Loops;

import com.team5.Menu.Input;

import java.util.ArrayList;
import java.util.Collections;

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
    public String task40(){
        System.out.print("Enter num of arr - ");
        int n = Input.getIntegerInput();
        int [] arr = new int[n];
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter arr elem"+(i+1)+" = ");
            arr[i]= Input.getIntegerInput();
            if(arr[i]>0){
                sum+=arr[i];
            }
        }
        System.out.println("Sum of pos elem = "+sum);
        return "Sum of pos elem = "+sum;
    }
    public String task41(){
        System.out.print("Enter num of parts - ");
        int a = Input.getIntegerInput();
        ArrayList<String> rev = new ArrayList<String>();
        for (int i = 0; i < a; i++) {
            System.out.print("Enter part"+(i+1)+" = ");
            String s = Input.getStrInput();
            rev.add(s);
        }
        Collections.reverse(rev);
        System.out.println("Reversed parts - "+rev);
        return "Reversed parts - "+rev;
    }
    public  int task42(){
        System.out.print("Enter father years - ");
        int fa = Input.getIntegerInput();
        System.out.print("Enter son years - ");
        int so = Input.getIntegerInput();
        System.out.println(Math.abs((so*2)-fa));
        return Math.abs((so*2)-fa);
    }
    public int task43 (){
        System.out.print("Enter number - ");
        int num = Input.getIntegerInput();
        System.out.println((int)Math.pow(Math.round(Math.sqrt(num)),2));
        return (int)Math.pow(Math.round(Math.sqrt(num)),2);
    }
}
