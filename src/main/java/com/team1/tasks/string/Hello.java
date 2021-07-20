package com.team1.tasks.string;

import com.team1.IRunTask;

import java.util.Arrays;
import java.util.Scanner;

public class Hello implements IRunTask {

    private String[] name;
    private String city;
    private String state;


    Scanner sc;

    public Hello(Scanner sc) {
        this.sc = sc;

    }

    public static String sayHello(String[] name, String city, String state) {
        return "Hello, " + Arrays.toString(name)
                .replace("[", "")
                .replace(",", "")
                .replace("]", "") + "! Welcome to " + city + ", " + state + "!";
    }

    @Override
    public void execute() {
        boolean mark = false;
        int size;
        System.out.println("Say welcome to your friend from another city, state");
        String b;
        do {
            try {
                System.out.println("Input amount of friends");
                size = sc.nextInt();

                System.out.println("Input name");

                for (int i = 0; i < size; i++) {
                    b = sc.next();
                    name[i] = b;
                }
                System.out.println("Input city");
                city = sc.next();

                System.out.println("Input state");
                state = sc.next();


                mark = true;
            } catch (Exception exception) {
                System.out.println("You have input illegal character, try again!");
                continue;
            }
        } while (mark == false);
        System.out.println(sayHello(name,city,state));

    }
}
