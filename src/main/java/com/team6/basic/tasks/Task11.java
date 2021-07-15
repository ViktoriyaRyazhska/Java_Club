package com.team6.basic.tasks;

import java.util.Scanner;

public class Task11 implements Task{

    private final Scanner scanner;

    public Task11(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void execute() {

        System.out.println("\t *** Task 11 executed *** ");

        int temp = 0;
        double c = (temp - 32) * 5.0/9;
        System.out.print (c + "is" + ( c > 0 ? "above " : "") + "freezing temperature");

    }
}

