package com.team6.string;

class Task2 {
    public static String solution(String str) {
        // Your code here...
        StringBuilder builder = new StringBuilder();
        builder.append(str);
        String reverseStr = String.valueOf(builder.reverse());
        return reverseStr;
    }
}
