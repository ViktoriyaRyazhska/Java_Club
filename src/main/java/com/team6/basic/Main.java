package com.team6.basic;

import com.team6.basic.tasks.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final List<BasicTask> functions = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        init();

        System.out.println(" *** Type '0' for instructions *** ");
        int option = 1;

        do {
            try {
                System.out.print("Task >> ");
                option = Integer.parseInt(scanner.nextLine());
                executeTask(option-1);
            } catch (Exception e) {
                System.out.println("Input value is not correct, please enter a number!...");
            }
        } while (option != 0);

        System.out.println(" *** Close *** ");
    }

    private static void init() {
        functions.add(() -> new Task1(scanner).execute());
        functions.add(() -> new Task2(scanner).execute());
        functions.add(() -> System.out.println("Task 3 is missing!..."));
        functions.add(() -> new Task4(scanner).execute());
        functions.add(() -> new Task5(scanner).execute());
        functions.add(() -> new Task6(scanner).execute());
        functions.add(() -> new Task7(scanner).execute());
        functions.add(() -> new Task8(scanner).execute());
        functions.add(() -> new Task9(scanner).execute());
    }

    private static void executeTask(int option) {
        try {
            functions.get(option).apply();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Task is not available, please try again!...");
        }
    }


}
