package com.team5.String;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StringRealizations {

    public static void StringRealization(){
        StringTasks stringTasks = new StringTasks();
        Scanner input = new Scanner(System.in);

        int caseNumber = 0;
        try {
            caseNumber = input.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Incorrect value");
        }        switch (caseNumber) {
            case 51: {

            } case 52:{

            } case 53:{

            } case 54:{

            } case 55:{

            } case 56:{

            } case 57:{

            } case 58:{

            } case 59:{

            } case 60:{

            } case 61:{

            } case 62:{

            } case 63:{
                System.out.println("Test");
            } case 64:{

            } case 65:{

            } case 66:{

            } case 67:{

            } case 68:{

            } default:
                System.out.println("Incorrect value!");
        }
    }
}
