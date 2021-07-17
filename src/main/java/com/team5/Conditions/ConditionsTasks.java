package com.team5.Conditions;

import com.team5.Menu.Input;

import java.util.InputMismatchException;

public class ConditionsTasks {

    public int task1(){
        System.out.println("Enter any number to get the opposite");
        int number = Input.getIntegerInput();
        int result = number - (number * 2);
        System.out.println(result);
        return result;
    }

    public boolean task2(){
        System.out.println("Enter the number you want to divide, then enter the two divisors you want to divide by," +
                " and the program will tell you if it divides");
        long n = Input.getIntegerInput();
        long x = Input.getIntegerInput();
        long y = Input.getIntegerInput();

        boolean result = false;

        if (n % x == 0 && n % y == 0){
            result = true;
        }

        System.out.println(result);
        return result;
    }

    public String task3(){
        System.out.println("Enter true or false and we will return it to you)");
        try {
            boolean b = Input.getBoolInput();
            if (b) {
                System.out.println("true");
                return "true";
            } else {
                System.out.println("false");
                return "false";
            }
        }catch (InputMismatchException e){
            System.out.println("Incorrect value");
        }
        return "kaka";
    }

    public String task4() {
        System.out.println("Enter salary, and bonus (true or false), if you choose true, the salary will increase 10 times");
        final int salary = Input.getIntegerInput();
        final boolean bonus = Input.getBoolInput();
        String result = "£";
        int temp;

        if (bonus){
            temp = salary * 10;
        }else temp = salary;

        result = result + temp;
        System.out.println("Salary - " + result);
        return result;
    }
    public String task22() {
        System.out.print("Enter birth year - ");
        int birth = Input.getIntegerInput();
        System.out.print("Enter year");
        int yearTo = Input.getIntegerInput();
        if(yearTo>birth){
            if(yearTo-birth==1){
                System.out.println(("You are 1 year old."));
                return "You are 1 year old.";
            }else{
                System.out.println(("You are "+(yearTo-birth)+" years old."));
                return "You are "+(yearTo-birth)+" years old.";
            }
        }else if(birth>yearTo){
            if(birth-yearTo==1){
                System.out.println(("You will be born in 1 year."));
                return "You will be born in 1 year.";
            }else{
                System.out.println(("You will be born in "+(birth-yearTo)+" years."));
                return "You will be born in "+(birth-yearTo)+" years.";
            }
        }else{
            System.out.println(("You were born this very year!"));
            return "You were born this very year!";
        }
    }
    public String task23() {
        System.out.print("Player 1");
        String p1=Input.getStrInput();
        System.out.println("Player 2");
        String p2=Input.getStrInput();
        if (p1 == p2) {
            System.out.println("Draw!");
            return "Draw!";
        } else if ((p1 == "rock" && p2 != "paper") || (p1 == "paper" && p2 != "scissors") || (p1 == "scissors" && p2 != "rock")){
            System.out.println("Player 1 won!");
            return "Player 1 won!";
        } else {
            System.out.println("Player 2 won!");
            return "Player 2 won!";
        }
    }
    public int task24() {
        System.out.println("Enter oper-");
        String op =Input.getStrInput();
        System.out.println("Enter num1");
        int v1= Input.getIntegerInput();
        System.out.println("Enter num2");
        int v2= Input.getIntegerInput();
        int res = 0;
        switch (op) {
            case "+":
                res = v1 + v2;
                break;
            case "-":
                res = v1 - v2;
                break;
            case "*":
                res = v1 * v2;
                break;
            case "/":
                res = v1 / v2;
                break;
        }
        System.out.println(res);
        return res;
    }
    public String task25(){
        System.out.print("Enter number of petals 1 - ");
        int f1 = Input.getIntegerInput();
        System.out.print("Enter number of petals 2 - ");
        int f2 = Input.getIntegerInput();
        System.out.println("Love-"+ ((f1+f2)%2 != 0));
        return "Love-"+ ((f1+f2)%2 != 0);
    }

    public String task12(int number){
        String strNum = "";
        switch (number){
            case 1: {
                strNum = "One";
                System.out.println("One");
                break;
            } case 2: {
                strNum = "Two";
                System.out.println("Two");
                break;
            } case 3: {
                strNum = "Three";
                System.out.println("Three");
                break;
            } case 4: {
                strNum = "Four";
                System.out.println("Four");
                break;
            } case 5: {
                strNum = "Five";
                System.out.println("Five");
                break;
            } case 6: {
                strNum = "Six";
                System.out.println("Six");
                break;
            } case 7: {
                strNum = "Seven";
                System.out.println("Seven");
                break;
            } case 8: {
                strNum = "Eight";
                System.out.println("Eight");
                break;
            } case 9: {
                strNum = "Nine";
                System.out.println("Nine");
                break;
            } case 0: {
                strNum = "Zero";
                System.out.println("Zero");
                break;
            }
            default:{
                System.out.println("Incorrect value");
            }
        }
        return strNum;
    }

    public String task13(String current) {
            String next = "";
            if(current.equalsIgnoreCase("green")){
                next = "Yellow";
                System.out.println("Yellow");
            }else if(current.equalsIgnoreCase("yellow")){
                next = "Red";
                System.out.println("Red");
            }else if (current.equalsIgnoreCase("red")){
                next = "Green";
                System.out.println("Green");
            }else System.out.println("Incorrect value");
        return next;
    }

    public int task14(int d){
        int totalCost;
        int costPerDay = 40;
        if(d >= 7 ){
            totalCost = (costPerDay*d) - 50;
        } else if(d >= 3){
            totalCost = (costPerDay*d) - 20;
        }else totalCost = costPerDay*d;
        return totalCost;
    }

}
