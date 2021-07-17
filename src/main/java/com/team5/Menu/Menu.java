package com.team5.Menu;

import java.util.InputMismatchException;

public class Menu {


    public static int menu(){
        int selection = 0;

        System.out.println("|Choose group of tasks:|");
        System.out.println("|----------------------|");
        System.out.println("1. Basic program");
        System.out.println("2. Classes");
        System.out.println("3. Conditions");
        System.out.println("4. Loops");
        System.out.println("5. OOP");
        System.out.println("6. String");
        System.out.println("7. Collections");
        System.out.println("------------------------");
        System.out.println("0. Exit.");
        System.out.println();

        try {
            selection = Input.getIntegerInput();
        }catch (InputMismatchException e){
            System.out.println("Incorrect value");
        }
        return selection;
    }

    public static void basicMenu(){

        System.out.println("|Select a task|");
        System.out.println("---------------");
        System.out.println("Task 1");
        System.out.println("Task 2");
        System.out.println("Task 3");
        System.out.println("Task 4");
        System.out.println("Task 6");
        System.out.println("Task 7");
        System.out.println("Task 8");
        System.out.println("Task 9");
        System.out.println("Task 10");
        System.out.println("Task 11");
        System.out.println("---------------");
        System.out.println("0. Quit.");
    }

    public static void classesMenu(){
        System.out.println("|Select a task|");
        System.out.println("---------------");
        System.out.println("Task 12");
        System.out.println("Task 13");
        System.out.println("Task 14");
        System.out.println("Task 15");
        System.out.println("Task 16");
        System.out.println("Task 17");
        System.out.println("---------------");
        System.out.println("0. Quit.");
    }

    public static void conditionsMenu(){
        System.out.println("|Select a task|");
        System.out.println("---------------");
        System.out.println("Task 18");
        System.out.println("Task 19");
        System.out.println("Task 20");
        System.out.println("Task 21");
        System.out.println("Task 22");
        System.out.println("Task 23");
        System.out.println("Task 24");
        System.out.println("Task 25");
        System.out.println("Task 26");
        System.out.println("Task 27");
        System.out.println("Task 28");
        System.out.println("Task 29");
        System.out.println("Task 30");
        System.out.println("Task 31");
        System.out.println("---------------");
        System.out.println("0. Quit.");
    }

    public static void loopsMenu(){
        System.out.println("|Select a task|");
        System.out.println("---------------");
        System.out.println("Task 32");
        System.out.println("Task 33");
        System.out.println("Task 34");
        System.out.println("Task 35");
        System.out.println("Task 36");
        System.out.println("Task 37");
        System.out.println("Task 38");
        System.out.println("Task 39");
        System.out.println("Task 40");
        System.out.println("Task 41");
        System.out.println("Task 42");
        System.out.println("Task 43");
        System.out.println("Task 44");
        System.out.println("Task 45");
        System.out.println("Task 46");
        System.out.println("---------------");
        System.out.println("0. Quit.");
    }

    public static void oopMenu(){
        System.out.println("|Select a task|");
        System.out.println("---------------");
        System.out.println("Task 47");
        System.out.println("Task 48");
        System.out.println("Task 49");
        System.out.println("Task 50");
        System.out.println("---------------");
        System.out.println("0. Quit.");
    }

    public static void stringMenu(){
        System.out.println("|Select a task|");
        System.out.println("---------------");
        System.out.println("Task 51");
        System.out.println("Task 52");
        System.out.println("Task 53");
        System.out.println("Task 54");
        System.out.println("Task 55");
        System.out.println("Task 56");
        System.out.println("Task 57");
        System.out.println("Task 58");
        System.out.println("Task 59");
        System.out.println("Task 60");
        System.out.println("Task 61");
        System.out.println("Task 62");
        System.out.println("Task 63");
        System.out.println("Task 64");
        System.out.println("Task 65");
        System.out.println("Task 66");
        System.out.println("Task 67");
        System.out.println("Task 68");
        System.out.println("---------------");
        System.out.println("0. Quit.");
    }

    public static void collectionsMenu(){
        System.out.println("|Select a task|");
        System.out.println("---------------");
        System.out.println("Task 69");
        System.out.println("Task 70");
        System.out.println("Task 71");
        System.out.println("Task 72");
        System.out.println("---------------");
        System.out.println("0. Quit.");
    }

}
