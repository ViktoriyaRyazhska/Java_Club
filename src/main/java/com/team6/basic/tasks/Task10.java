package com.team6.basic.tasks;

import  java.util.Scanner;

public class Task10 implements Task{

    private final Scanner scanner;

    public Task10(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void execute() {

        System.out.println("\t *** Task 10 executed *** ");

        int age =21;

        int min =0;
        int max =0;
        if (age <= 14) {
            min = (int) (age - (0.10 *age));
            max = (int) (age + (0.10 *age));
        }
        else if (age >14) {
            min = (age/2) +7;
            max = (age -7)*2;
        }
        System.out.println(min + "-" + max);
    }

}
