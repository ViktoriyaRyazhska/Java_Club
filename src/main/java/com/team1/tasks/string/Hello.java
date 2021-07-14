package com.team1.tasks.string;

import java.util.Arrays;

public class Hello {
    private Hello() {
    }

    public static String sayHello(String[] name, String city, String state) {
        return "Hello, " + Arrays.toString(name)
                .replace("[", "")
                .replace(",", "")
                .replace("]", "") + "! Welcome to " + city + ", " + state + "!";
    }
}
