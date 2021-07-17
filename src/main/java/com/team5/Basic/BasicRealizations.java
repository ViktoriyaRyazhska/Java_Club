package com.team5.Basic;



import com.team5.Menu.Input;
import com.team5.Menu.Menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BasicRealizations {

    public static void basicRealization() {
        BasicTasks basicTasks = new BasicTasks();

        int caseNumber = 0;
        try {
            caseNumber = Input.getIntegerInput();
        }catch (InputMismatchException e){
            System.out.println("Incorrect value");
        }
            switch (caseNumber) {
                case 1: {
                    basicTasks.task1();
                    break;
                } case 2:{

                } case 3:{

                } case 4:{

                } case 5:{

                } case 6:{

                } case 7:{
                    System.out.println("Enter the hours, minutes, and seconds to convert them to milliseconds");
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
