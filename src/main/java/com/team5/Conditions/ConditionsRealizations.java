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

            } case 19:{

            } case 20:{

            } case 21:{

            } case 22:{

            } case 23:{

            } case 24:{

            } case 25:{

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
