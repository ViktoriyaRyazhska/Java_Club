package com.team5.Basic;

import com.team5.Menu.Input;


public class BasicTasks {

    public int task1() {
        System.out.println("Enter your number");
        int i = Input.getIntegerInput();
        int result = i*2;
        System.out.println(result);
        return result;
    }

    public int task2(int num1, int num2){
        int result = num1*num2;
        System.out.println(result);
        return result;
    }

    public double task3(final double length, final double width, final double height){
        double result = length*width*height;
        System.out.println(result);
        return result;
    }
    public void task4(int a, int b){
        System.out.println(a%b==0);

    }
    public void task5 (String name) {
        if(name.equals("Johnny")){
            System.out.println("Hello, my love!");
        }else{
            System.out.println(String.format("Hello, %s!", name));
        }
    }
    public void task6(int a) {
        System.out.println(Integer.parseInt(Integer.toBinaryString(a)));

    }
    public int task7(){
        System.out.println("Enter the hours, minutes, and seconds to convert them to milliseconds");
        int h = Input.getIntegerInput();
        int m = Input.getIntegerInput();
        int s = Input.getIntegerInput();
        int result = (h * 360000) + (m * 60000) + (s * 1000);
        System.out.println(result);
        return result;
    }

    public int task8(){
        System.out.println("Enter any year to find out what century it is");
        int result;
        int number = Input.getIntegerInput();

        if(number % 100 == 0){
            result = number / 100;
        }else{
            result = (number / 100) + 1;
        }
        System.out.println(result);
        return result;
    }

    public int task9(){
        System.out.println("Enter any number and you will get the same but negative");
        int x = Input.getIntegerInput();
        int result = x;

        if(result > 0){
            result = x - (x * 2);
        }
        System.out.println(result);

        return result;
    }

}
