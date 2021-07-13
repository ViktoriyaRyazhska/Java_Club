package com.team6.basic.tasks;

import java.util.Scanner;

public class Task2 implements Task {

    private final Scanner scanner;

    public Task2(Scanner scanner) {
        this.scanner = scanner;
    }

    private int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public void execute() {
        System.out.println("\t *** task 1 executed *** ");

        System.out.println("\tMultiply ");

        try {
            System.out.print("\tEnter a >> ");
            int a = Integer.parseInt(scanner.nextLine());
            System.out.print("\tEnter b >> ");
            int b = Integer.parseInt(scanner.nextLine());

            System.out.println("\tResult: " + multiply(a, b));
        } catch (Error e) {
            System.out.println("\tThis is not integer");
        }
    }
}
