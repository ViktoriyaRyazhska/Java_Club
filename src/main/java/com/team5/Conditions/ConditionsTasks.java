package com.team5.Conditions;

public class ConditionsTasks {

    public int task1(int number){
        return number - (number * 2);
    }

    public boolean task2(long n, long x, long y){
        boolean result = false;

        if (n % x == 0 && n % y == 0){
            result = true;
        }

        return result;
    }

    public String task3(boolean b){
        if(b) {
            return "true";
        } else {
            return "false";
        }
    }

    public String task4(final int salary, final boolean bonus) {
        String result = "£";
        int temp;

        if (bonus){
            temp = salary * 10;
        }else temp = salary;

        result = result + temp;

        return result;
    }
    public void task22(int birth, int yearTo) {
        if(yearTo>birth){
            if(yearTo-birth==1){
                System.out.println(("You are 1 year old."));
            }else{
                System.out.println(("You are "+(yearTo-birth)+" years old."));
            }
        }else if(birth>yearTo){
            if(birth-yearTo==1){
                System.out.println(("You will be born in 1 year."));
            }else{
                System.out.println(("You will be born in "+(birth-yearTo)+" years."));
            }
        }else{
            System.out.println(("You were born this very year!"));
        }
    }
    public void task23(String p1, String p2) {
        if (p1 == p2) {
            System.out.println("Draw!");
        } else if ((p1 == "rock" && p2 != "paper") || (p1 == "paper" && p2 != "scissors") || (p1 == "scissors" && p2 != "rock")){
            System.out.println("Player 1 won!");
        } else {
            System.out.println("Player 2 won!");
        }
    }
    public void task24(String op, int v1, int v2)
    {
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
    }
    public void task25(int f1, int f2){
        System.out.println("Love-"+ ((f1+f2)%2 != 0));
    }

}
