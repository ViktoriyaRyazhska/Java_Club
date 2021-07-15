package com.team6.conditions;

class Task5 {
    public static String CalculateAge(int birth, int yearTo) {
        if (birth == yearTo){
            return "You were born this very year!";
        }else if(birth  <  yearTo){
            return "You are "+(yearTo-birth)  +" years old.";
        }else {
            return "You will be born in "  + (birth - yearTo) +" year";
        }
    }
}
