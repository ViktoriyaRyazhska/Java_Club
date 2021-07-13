package com.team5.OOP;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OOPRealizations {

    public static void OOPRealization(){
        OOPTasks oopTasks = new OOPTasks();
        Scanner input = new Scanner(System.in);

        int caseNumber = 0;
        try {
            caseNumber = input.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Incorrect value");
        }        switch (caseNumber) {
            case 47: {

            } case 48:{

            } case 49:{

            } case 50:{

            } default:
                System.out.println("Incorrect value!");
        }
    }
}
