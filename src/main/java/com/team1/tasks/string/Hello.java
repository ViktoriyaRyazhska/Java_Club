package com.team1.tasks.string;

import com.team1.IRunTask;

import java.util.Arrays;

public class Hello implements IRunTask {
    public Hello() {
        //no args
    }

    public static String sayHello(String[] name, String city, String state) {
        return "Hello, " + Arrays.toString(name)
                .replace("[", "")
                .replace(",", "")
                .replace("]", "") + "! Welcome to " + city + ", " + state + "!";
    }

    @Override
    public void execute() {
        String[]arr={"Josh","Smith"};
        System.out.println(sayHello(arr,"Lviv","Lvivskiy"));
    }
}
