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
    public boolean task4(){
        System.out.println("Enter size of the wall in millimeters");
        int a = Input.getIntegerInput();
        System.out.println("Enter size of a pixel in millimeters");
        int b = Input.getIntegerInput();
        System.out.println(a%b==0);
        return a%b==0;

    }
    public String task5 () {
        System.out.println("Enter your name");
        String name = Input.getStrInput();

        if(name.equals("Johnny")){
            System.out.println("Hello, my love!");
            return "Hello, my love!";
        }else{
            System.out.println(String.format("Hello, %s!", name));
            return String.format("Hello, %s!", name);
        }

    }
    public int task6() {
        System.out.println("Enter number");
        int a = Input.getIntegerInput();
        System.out.println(Integer.parseInt(Integer.toBinaryString(a)));
        return Integer.parseInt(Integer.toBinaryString(a));

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
