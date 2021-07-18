package com.team5.Basic;

import com.team5.Menu.Input;


public class BasicTasks {

    public int task1(int i) {
        return i*2;
    }
    public void task1IO(){
        System.out.println(" You need to double the integer and return it.");
        System.out.println("Enter your number");
        int i = Input.getIntegerInput();
        System.out.println(task1(i));
    }

    public int task2(int num1, int num2){
        return num1*num2;
    }

    public void task2IO(){
        System.out.println("Implement a function which multiplies two numbers.");
        System.out.println("Enter firs number");
        int num1 = Input.getIntegerInput();
        System.out.println("Enter second number");
        int num2 = Input.getIntegerInput();
        System.out.println(task2(num1,num2));
    }

    public int task3(int length, int width, int height){
        return length*width*height;
    }
    public void task3IO(){
        System.out.println("Bob needs a fast way to calculate the volume of a cuboid with three values: length, " +
                "width and the height of the cuboid. Write a function to help Bob with this calculation.");
        System.out.println("Enter length");
        int length = Input.getIntegerInput();
        System.out.println("Enter width");
        int width = Input.getIntegerInput();
        System.out.println("Enter height");
        int height = Input.getIntegerInput();
        System.out.println(task3(length,width,height));
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

    public int task7(int h, int m, int s){
        return (h * 360000) + (m * 60000) + (s * 1000);
    }

    public void task7IO(){
        System.out.println("Enter the hours, minutes, and seconds to convert them to milliseconds");
        int h = Input.getIntegerInput();
        int m = Input.getIntegerInput();
        int s = Input.getIntegerInput();
        System.out.println(task7(h, m, s));
    }

    public int task8(int number){

        int result;

        if(number % 100 == 0){
            result = number / 100;
        }else{
            result = (number / 100) + 1;
        }

        return result;
    }

    public void task8IO(){
        System.out.println("Enter any year to find out what century it is");
        int number = Input.getIntegerInput();
        System.out.println(task8(number));
    }

    public int task9(int x){

        int result = x;

        if(result > 0){
            result = x - (x * 2);
        }

        return result;
    }

    public void task9IO(){
        System.out.println("Enter any number and you will get the same but negative");
        int x = Input.getIntegerInput();
        System.out.println(task9(x));
    }
}
