package com.team5.Conditions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConditionsRealizations {

    public static void conditionsRealization(){
        ConditionsTasks conditionsTasks = new ConditionsTasks();
        Scanner input = new Scanner(System.in);

        int caseNumber = 0;
        try {
            caseNumber = input.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Incorrect value");
        }        switch (caseNumber) {
            case 18: {
                conditionsTasks.task1();
                break;
            } case 19:{
                conditionsTasks.task2();
                break;
            } case 20:{
                conditionsTasks.task3();
                break;
            } case 21:{
                conditionsTasks.task4();
                break;
            } case 22:{
                conditionsTasks.task22();
                break;
            } case 23:{
                conditionsTasks.task23();
                break;
            } case 24:{
                conditionsTasks.task24();
                break;
            } case 25:{
               conditionsTasks.task25();
               break;
            } case 26:{

            } case 27:{

            } case 28:{

            } case 29:{

            } case 30:{

            } case 31:{

            } default:
                System.out.println("Incorrect value!");
        }
    }
}
