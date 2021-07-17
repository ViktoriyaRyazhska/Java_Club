package com.team5.Loops;

import com.team5.Menu.Input;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LoopsTasks {

    public String task32(int repeat, String string){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < repeat; i++) {
            sb.append(string);
        }
        return sb.toString();
    }

    public void task32IO() {
        System.out.println("Write a function called repeatStr which repeats the given string string exactly n times.");
        System.out.println("How times it will be repeat?");
        int repeat = Input.getIntegerInput();
        System.out.println("Enter your word");
        String string = Input.getStrInput();

        System.out.println(task32(repeat, string));
    }

    public int[] task33(int humanYears){
        int catYears =0, dogYears = 0;
        switch (humanYears) {
            default:
                catYears = 4 * (humanYears - 2);
                dogYears = 5 * (humanYears - 2);
            case 2:
                catYears += 9;
                dogYears += 9;
            case 1:
                catYears += 15;
                dogYears += 15;
        }
        int[] arr = {humanYears, catYears, dogYears};
        for(int i = 0; i <arr.length; i++){
            System.out.println(arr[i]);
        }
        return arr;
    }

    public void task33IO() {
        System.out.println("Enter human years");
        int humanYears = Input.getIntegerInput();

        System.out.println(task33(humanYears));
    }

    public int task34(int[] marks){
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }

        return sum / marks.length;
    }

    public void task34IO(){
        System.out.println("Return the average of the given array rounded down to its nearest integer.");
        int[] marks = {5,8,6,2,4};
        for (int a : marks){
            System.out.print(a + ",");
        }
        System.out.println("\nAverage: " + task34(marks));
    }

    public int[] task35(int[] arr) {
        return Arrays.stream(arr).map(x -> x*2).toArray();
    }

    public void task35IO(){
        System.out.println("Given an array of integers, return a new array with each value doubled.\n" +
                "\n" +
                "For example:\n" +
                "\n" +
                "[1, 2, 3] --> [2, 4, 6]");
        int[] arr = {1,2,3};
        for (int i : arr){
            System.out.print(i + " ");
        }
        System.out.print(" --> ");
        for (int i : task35(arr)){
            System.out.print(i + " ");
        }
    }

    public int task44(int n) {

        int result = 0;
        for (int i = 1; i <= n; i++){
            result += i;
        }
        System.out.println(result);
        return result;
    }

    //i need help
    public long[] task45(){
        System.out.println("Im stupid");
//        int g = Input.getIntegerInput();
//        int m = Input.getIntegerInput();
//        int n = Input.getIntegerInput();

        long[] result = new long[0];
        System.out.println(result);
        return result;
    }

    public int task46(int sticks){
        return sticks % 4 == 0 ? 1 : sticks % 4;
    }

    public void task46IO(){
        System.out.println("In this game, there are 21 sticks lying in a pile. Players take turns taking 1, 2, or 3 sticks. " +
                "The last person to take a stick wins. \n" +
                "That is the robot that will always win the game. Robot will always go first. \n" +
                "Enter the number of sticks, and robot will win.........");
        int sticks = Input.getIntegerInput();
        System.out.println(task46(sticks));
    }
    public String task40(int n, int[] arr,int sum){
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter arr elem"+(i+1)+" = ");
            arr[i]= Input.getIntegerInput();
            if(arr[i]>0){
                sum+=arr[i];
            }
        }
        return "Sum of pos elem = "+sum;
    }
    public void task40IO() {
        System.out.print("Enter num of arr - ");
        int n = Input.getIntegerInput();
        int[] arr = new int[n];
        int sum = 0;
        System.out.println(task40(n,arr,sum));
    }
    public String task41(ArrayList<String> rev){
        Collections.reverse(rev);
        return "Reversed parts - "+rev;
    }
    public void task41IO() {
        System.out.print("Enter num of parts - ");
        int a = Input.getIntegerInput();
        ArrayList<String> rev = new ArrayList<String>();
        for (int i = 0; i < a; i++) {
            System.out.print("Enter part"+(i+1)+" = ");
            String s = Input.getStrInput();
            rev.add(s);
        }
        System.out.println(task41(rev));
    }
    public  int task42(int fa, int so){
        return Math.abs((so*2)-fa);
    }
    public  void task42IO() {
        System.out.print("Enter father years - ");
        int fa = Input.getIntegerInput();
        System.out.print("Enter son years - ");
        int so = Input.getIntegerInput();
        System.out.println(task42(fa, so));
    }
    public int task43 (int num){
        return (int)Math.pow(Math.round(Math.sqrt(num)),2);
    }
    public void task43IO(){
        System.out.print("Enter number - ");
        int num = Input.getIntegerInput();
        System.out.println(task43(num));

    }
}
