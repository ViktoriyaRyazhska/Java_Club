package com.team5.Classes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ClassesRealizations {

    public static void classesRealization() {
        ClassesTasks classesTasks = new ClassesTasks();
        Scanner input = new Scanner(System.in);

        int caseNumber = 0;
        try {
            caseNumber = input.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Incorrect value");
        }        switch (caseNumber) {
            case 12: {

            } case 13: {

            } case 14: {
                System.out.println("test");
            } case 15: {

            }

            case 16:{
                System.out.println("Fighter 1 name");
                String name1 = input.next();
                System.out.println("Fighter 1 health");
                int h1 = input.nextInt();
                System.out.println("Fighter 1 damage");
                int d1 = input.nextInt();
                System.out.println("Fighter 2 name");
                String name2 = input.next();
                System.out.println("Fighter 2 health");
                int h2 = input.nextInt();
                System.out.println("Fighter 2 damage");
                int d2 = input.nextInt();
                System.out.println("First attacker name");
                String fName=input.next();
                classesTasks.task16(new Fighter(name1, h1, d1),new Fighter(name2,h2,d2), fName);
                break;
            }
            case 17: {

            } default:
                System.out.println("Incorrect value!");
        }
    }

}
