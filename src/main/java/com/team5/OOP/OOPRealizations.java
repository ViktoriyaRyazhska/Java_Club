package com.team5.OOP;

import com.team5.Menu.Input;

import com.team5.Menu.Menu;
import com.team5.OOP.Task1.God;

import java.util.InputMismatchException;

public class OOPRealizations {

    public static void OOPRealization(){
        OOPTasks oopTasks = new OOPTasks();
        for (; ; ) {

        int caseNumber = 0;
        try {
            caseNumber = Input.getIntegerInput();
        }catch (InputMismatchException e){
            System.out.println("Incorrect value");
        }
        switch (caseNumber) {
            case 0: {
                Menu.mainSwitch();
            }case 47: {
                God god = new God();
                god.create();
                break;
            } case 48:{

            } case 49:{
                oopTasks.task49();
                break;
            } case 50:{

                }
                default:
                    System.out.println("Incorrect value!");
            }
            Menu.oopMenu();
        }
    }
}
