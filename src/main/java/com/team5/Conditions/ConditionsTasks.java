package com.team5.Conditions;

import com.team5.Menu.Input;

import java.util.InputMismatchException;

public class ConditionsTasks {

    public int task18(){
        System.out.println("Enter any number to get the opposite");
        int number = Input.getIntegerInput();
        int result = number - (number * 2);
        System.out.println(result);
        return result;
    }

    public boolean task19(){
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

    public String task20(){
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

    public String task21() {
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

    public String task26(int number){
        switch(number){
            case 0:return "Zero";
            case 1:return "One";
            case 2:return "Two";
            case 3:return "Three";
            case 4:return "Four";
            case 5:return "Five";
            case 6:return "Six";
            case 7:return "Seven";
            case 8:return "Eight";
            case 9:return "Nine";
        }
        return "";
    }


    public void task26IO(){
        System.out.println("When provided with a number between 0-9, return it in words.\n" +
                "\n" +
                "Input :: 1\n" +
                "\n" +
                "Output :: \"One\".");
        System.out.println("Enter number");
        int number = Input.getIntegerInput();
        System.out.println(task26(number));
    }

    public String task27(String current){
        switch (current) {
            case "red": return "green";
            case "yellow": return "red";
            case "green": return "yellow";
            default: throw new IllegalArgumentException();
        }
    }

    public void task27IO() {
        System.out.println("Complete the function that takes a string as an argument representing the current state of " +
                "the light and returns a string representing the state the light should change to.");
        System.out.println("Enter a colour");
        String current = Input.getStrInput();
        System.out.println(task27(current));
    }

    public int task28(int d){
        final int COST_PER_DAY = 40;

        if (d < 3)       return d * COST_PER_DAY;
        else if (d >= 7) return d * COST_PER_DAY - 50;
        else             return d * COST_PER_DAY - 20;
    }

    public void task28IO(){
        System.out.println("You will need a rental car in order for you to get around in your vacation. The manager of the car rental makes you some good offers.\n" +
                "\n" +
                "Every day you rent the car costs $40. If you rent the car for 7 or more days, you get $50 off your total." +
                " Alternatively, if you rent the car for 3 or more days, you get $20 off your total.");
        System.out.println("Enter number of days");
        int d = Input.getIntegerInput();
        System.out.println(task28(d) + "$");
    }

}
