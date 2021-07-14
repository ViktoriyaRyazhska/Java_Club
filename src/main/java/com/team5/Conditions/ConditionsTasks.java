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

}
