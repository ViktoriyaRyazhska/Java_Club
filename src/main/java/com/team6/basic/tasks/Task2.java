package com.team6.basic.tasks;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Task2 implements Task {

    private final Scanner scanner;

    public Task2(Scanner scanner) {
        this.scanner = scanner;
    }

    private static int multiply(int a, int b) {
        return IntStream.iterate(a, x -> x).limit(b).sum();
    }

    @Override
    public void execute() {
        System.out.println("\t *** Task 2 executed *** ");

        System.out.println("\tMultiply ");

        try {
            System.out.print("\tEnter a >> ");
            int a = Integer.parseInt(scanner.nextLine());
            System.out.print("\tEnter b >> ");
            int b = Integer.parseInt(scanner.nextLine());

            System.out.println("\t === Result: " + multiply(a, b));
        } catch (Exception e) {
            System.out.println("\tException:: Input value is not correct, please enter a number!...");
            execute();
        }
    }
}
