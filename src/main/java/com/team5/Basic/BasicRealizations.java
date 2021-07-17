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
                    basicTasks.task7();
                    break;
                } case 8:{
                    basicTasks.task8();
                    break;
                } case 9:{
                    basicTasks.task9();
                    break;
                } case 10:{

                } case 11:{

                } default:
                    System.out.println("Incorrect value!");
            }
    }
}
