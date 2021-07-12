package com.company.basicTasks;

import com.company.IRunTask;

import java.util.Scanner;

public class BasicTask5 implements IRunTask {


    private String name;

    public static String greet(String name) {

        if (name.equals("Johnny")) {
            return "Hello, my love!";
        }

        return String.format("Hello, %s!", name);
    }

    public BasicTask5() {
    }

    @Override
    public void execute() {
        boolean mark = false;
        System.out.println("Input name you want to greet!");
        do {
            try {
                Scanner sc = new Scanner(System.in);
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
