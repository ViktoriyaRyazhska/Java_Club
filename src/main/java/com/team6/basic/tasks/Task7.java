package com.team6.basic.tasks;

import java.util.Scanner;

public class Task7 implements Task{

    private static int convertedTime;
    private final Scanner scanner;

    public Task7(Scanner scanner) {
        this.scanner = scanner;
    }

    public static int convertTimeToMilisecond(int hours,int minute,int second){
        try {
            if (0 <= hours && hours <= 23 && 0 <= minute && minute <= 60 && 0 <= second && second <= 60) {
                convertedTime = hours * 3600000 + minute * 60000 + second * 1000;

            }else{
                throw new RuntimeException();
            }

        }catch (RuntimeException runtimeException ){
            System.out.println("\tIncorrect data");
        }
        return convertedTime;
    }

    @Override
    public void execute() {

        System.out.println("\t *** Task 7 executed *** ");

        System.out.println("\tTime Converter ");

        System.out.println("Next 3 line write: " +
                "\nHours " +
                "\nMinute " +
                "\nSecond");
        try {
            System.out.println(convertTimeToMilisecond(Integer.parseInt(scanner.nextLine()),Integer.parseInt(scanner.nextLine()),Integer.parseInt(scanner.nextLine())));
        }catch (Exception e ){
            System.out.println("\tThis is not integer");
            execute();
        }
    }
}
