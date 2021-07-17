package com.team6.basic.tasks;

import java.util.Scanner;

public class Task9 implements Task{

    private final Scanner scanner;

    public Task9(Scanner scanner) {
        this.scanner = scanner;
    }

    public static int negativeConverter(int number){
        return -number;
    }

    @Override
    public void execute() {

        System.out.println("\t *** Task 9 executed *** ");

        System.out.println("\tNegative converter ");

        try {
            System.out.println("\tEnter number");
            System.out.println(negativeConverter(Integer.parseInt(scanner.nextLine())));
        }catch (Exception e){
            System.out.println("\tThis is not integer");
            execute();
        }
    }
}
