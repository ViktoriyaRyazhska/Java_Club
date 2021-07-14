package com.team6.basic.tasks;

import java.util.Scanner;

public class Task8 implements Task{

    private static final int century = 100;
    private final Scanner scanner;

    public Task8(Scanner scanner) {
        this.scanner = scanner;
    }

    private static int calculateCentury(int years){
        int checkingAge = 0;
        int convertedAgeToCentury = 0;
        while (true){
            if(checkingAge >= years){
                break;
            }
            convertedAgeToCentury++;
            checkingAge += century;
        }
        return convertedAgeToCentury;
    }

    @Override
    public void execute() {

        System.out.println("\t *** Task 8 executed *** ");

        System.out.println("\tAge Converter ");

        try {
            System.out.println("\tWrite age ");
            System.out.println(calculateCentury(Integer.parseInt(scanner.nextLine())));
        }catch (Exception e ){
            System.out.println("\tThis is not integer");
        }
    }
}
