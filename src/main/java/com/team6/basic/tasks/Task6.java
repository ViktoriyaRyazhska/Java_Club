package com.team6.basic.tasks;

import java.util.Scanner;

public class Task6 implements Task{

    private final Scanner scanner;

    public Task6(Scanner scanner) {
        this.scanner = scanner;
    }

    public String toBinary(int number){return  Integer.toString(number, 2);}

    @Override
    public void execute() {

        System.out.println("\t *** Task 6 executed *** ");

        System.out.println("\ttoBinary ");

        try {

            System.out.println("\tEnter number to be converted to binary");

            int number = Integer.parseInt(scanner.nextLine());
            System.out.println(toBinary(number));

        }catch (Exception e ){
            System.out.println("\tEnter integer number");
        }
    }
}
