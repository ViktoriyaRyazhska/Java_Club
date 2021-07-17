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

            } case 16: {

            } case 17: {

            } default:
                System.out.println("Incorrect value!");
        }
    }

}
