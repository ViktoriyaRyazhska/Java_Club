package com.team6.basic.tasks;

import java.util.Scanner;

public class Task5 implements Task{

    private final Scanner scanner;

    public Task5(Scanner scanner) {
        this.scanner = scanner;
    }

    public void greeting(String name){
        if (name.equals("Johnny")) {
            System.out.println("\tHello, my love");
        } else {
            System.out.println("\tHello, " + name);
        }
    }

    @Override
    public void execute() {

        System.out.println("\t *** Task 5 executed *** ");

        System.out.println("\tGreeting ");

        System.out.println("\tEnter a name");
        String name = scanner.nextLine();
        greeting(name);

    }
}
