package com.team5.Loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LoopsRealizations {

    public static void loopsRealization(){
        LoopsTasks loopsTasks = new LoopsTasks();
        Scanner input = new Scanner(System.in);

        int caseNumber = 0;
        try {
            caseNumber = input.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Incorrect value");
        }        switch (caseNumber) {
            case 32: {

            } case 33:{

            } case 34:{

            } case 35:{

            } case 36:{

            } case 37:{

            } case 38:{

            } case 39:{

            } case 40:{

            } case 41:{

            } case 42:{

            } case 43:{

            } case 44:{
                loopsTasks.task13();
                break;
            } case 45:{
                loopsTasks.task14();
                break;
            } case 46:{
                loopsTasks.task15();
                break;
            } default:
                System.out.println("Incorrect value!");
        }
    }
}
