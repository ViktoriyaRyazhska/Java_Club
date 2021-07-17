package com.team6.basic.tasks;

import java.util.Scanner;

public class Task4 implements Task {

    private final Scanner scanner;

    public Task4(Scanner scanner) {
        this.scanner = scanner;
    }

    public static String isExactNumber(int wallLength,int pixelSize){
        if (wallLength % pixelSize == 0) {
            return "\tWe know exact number = "+ ( wallLength / pixelSize  );
        } else {
            return "\tSorry but exact number is not exist";
        }
    }

    @Override
    public  void execute() {
        System.out.println("\t *** Task 4 executed *** ");

        System.out.println("\tisDivisible ");

        try {

            System.out.println("\tEnter wall length");

            int wallLength = Integer.parseInt(scanner.nextLine());

            System.out.println("\t Enter pixel size");

            int pixelSize = Integer.parseInt(scanner.nextLine());
            System.out.println( isExactNumber(wallLength,pixelSize));

        } catch (Exception e) {
            System.out.println("\tEnter integer number ");
            execute();
        }
    }
}
