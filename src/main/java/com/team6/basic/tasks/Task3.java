package com.team6.basic.tasks;

import java.util.Scanner;


public class Task3 implements Task {

    private final Scanner scanner;

    public Task3(Scanner scanner) {
        this.scanner = scanner;
    }

    public static int cuboidVolume(int a, int b, int c) {
        return a * b * c;
    }

    @Override
    public void execute() {
        System.out.println(" *** Task 3 *** ");

        System.out.println("\tGet volume of cuboid ");

        try {
            System.out.print("\tEnter height >> ");
            int a = Integer.parseInt(scanner.nextLine());
            System.out.print("\tEnter width  >> ");
            int b = Integer.parseInt(scanner.nextLine());
            System.out.print("\tEnter length >> ");
            int c = Integer.parseInt(scanner.nextLine());

            System.out.println("\t === Result: " + cuboidVolume(a, b, c));
        } catch (Exception e) {
            System.out.println("\tException:: Input value is not correct, please enter a number!...");
            execute();
        }
        



    }
}
