package com.team6.basic.tasks;

import java.util.Scanner;

public class Task1 implements Task {
    private final Scanner scanner;

    public Task1(Scanner scanner) {
        this.scanner = scanner;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }


    @Override
    public void execute() {
        System.out.println(" *** task 1 executed *** ");

//        System.out.print("Enter a >> ");
//        int a = scanner.nextInt();
//        System.out.print("Enter b >> ");
//        int b = scanner.nextInt();

        System.out.println("Result: " + multiply(2,2));
    }
}
