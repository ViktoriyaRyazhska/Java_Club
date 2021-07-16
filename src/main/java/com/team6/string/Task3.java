package com.team6.string;

import java.util.Arrays;

class Task3 {
    public static String sayHello(String [] name, String city, String state){
        StringBuilder sb = new StringBuilder();
        for (String string: name) {
            sb.append(string);
            sb.append(" ");
        }
        String str = "Hello,"+ sb +" Welcome to "+city+" "+state+"!";
        return str;
    }
}
