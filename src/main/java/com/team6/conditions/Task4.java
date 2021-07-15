package com.team6.conditions;

class Task4 {
    public static String bonusTime(final int salary, final boolean bonus) {
        if (bonus){
            return "£"+salary*10;
        }else{
            return "£"+salary;
        }
    }
}
