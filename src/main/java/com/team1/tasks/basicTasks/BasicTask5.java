package com.team1.tasks.basicTasks;


import com.team1.IRunTask;

import java.util.Scanner;

public class BasicTask5 implements IRunTask {


    private String name;
    Scanner sc;

    public BasicTask5(Scanner sc) {
        this.sc = sc;
    }

    public static String greet(String name) {

        if (name.equals("Johnny")) {
            return "Hello, my love!";
        }

        return String.format("Hello, %s!", name);
    }

    @Override
    public void execute() {
        boolean mark = false;
        System.out.println("Input name you want to greet!");
        do {
            try {
                name = sc.nextLine();
                mark = true;
            } catch (Exception exception) {
                System.out.println("You have input illegal character, try again!");
                continue;
            }
        } while (mark == false);
        System.out.println(greet(name));
    }
}
