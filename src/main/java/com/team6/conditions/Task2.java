package com.team6.conditions;

import com.team6.basic.CustomException;

class Task2 {
    public static boolean isDivisible(long n, long x, long y) throws CustomException {
        if (x ==0 || y == 0){
            throw new CustomException("FF");
        }
        return n % x == 0 && n % y == 0;
    }
}
