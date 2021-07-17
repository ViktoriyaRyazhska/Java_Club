package com.team6.basic.tasks;

import java.util.Scanner;

public class Task1 implements Task {
    private final Scanner scanner;

    public Task1(Scanner scanner) {
        this.scanner = scanner;
    }

    public static int doubleInteger(int i) {
        return i * 2;
    }

    @Override
    public void execute() {
        System.out.println("\t *** Task 1 executed *** ");

        System.out.println("\tDouble integer ");
        System.out.print("\tEnter i >> ");
        try {
            int i = Integer.parseInt(scanner.nextLine());
            System.out.println("\t === Result: " + doubleInteger(i));
        } catch (Exception e) {
            System.out.println("\tException:: Input value is not correct, please enter a number!...");
            execute();
        }
    }


}
