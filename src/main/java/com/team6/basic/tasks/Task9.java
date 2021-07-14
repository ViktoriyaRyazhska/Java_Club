package com.team6.basic.tasks;

import java.util.Scanner;

public class Task9 implements Task{

    private final Scanner scanner;

    public Task9(Scanner scanner) {
        this.scanner = scanner;
    }

    public int negativeConverter(int number){
        number = -number;
        return number;
    }

    @Override
    public void execute() {

        System.out.println("\t *** Task 9 executed *** ");

        System.out.println("\tAge Converter ");

        try {
            System.out.println("\tEnter number");
            System.out.println(negativeConverter(Integer.parseInt(scanner.nextLine())));
        }catch (Exception e){
            System.out.println("\tEnter integer number");
        }
    }
}
