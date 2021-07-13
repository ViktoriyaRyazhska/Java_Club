package com.team5.Basic;



import java.util.InputMismatchException;
import java.util.Scanner;

public class BasicRealizations {

    public static void basicRealization() {
        BasicTasks basicTasks = new BasicTasks();
        Scanner input = new Scanner(System.in);

        int caseNumber = 0;
        try {
            caseNumber = input.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Incorrect value");
        }
            switch (caseNumber) {
                case 1: {
                    System.out.println("Enter your number");
                    int i = input.nextInt();
                    basicTasks.task1(i);
                    break;
                } case 2:{

                } case 3:{

                } case 4:{

                } case 5:{

                } case 6:{

                } case 7:{
                    System.out.println("Enter the hours, minutes, and seconds to convert them to milliseconds");
                    int h = input.nextInt();
                    int m = input.nextInt();
                    int s = input.nextInt();
                    basicTasks.task7(h,m,s);
                    break;
                } case 8:{

                } case 9:{

                } case 10:{

                } case 11:{

                } default:
                    System.out.println("Incorrect value!");
            }
    }
}
