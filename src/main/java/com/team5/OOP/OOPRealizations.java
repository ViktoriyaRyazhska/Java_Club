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
            case 1: {

            } case 2:{

            } case 3:{
                System.out.println("Enter your string for encoding");
                String str = input.nextLine();
                oopTasks.task3(str);
                break;
            } case 4:{

            } default:
                System.out.println("Incorrect value!");
        }
    }
}
