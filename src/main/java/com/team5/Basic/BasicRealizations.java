package com.team5.Basic;

import com.team5.Menu.Input;
import com.team5.Menu.Menu;

import java.util.InputMismatchException;

public class BasicRealizations {

    public static void basicRealization() {
        BasicTasks basicTasks = new BasicTasks();
        for (;;) {
            int caseNumber = 0;
            try {
                caseNumber = Input.getIntegerInput();
            } catch (InputMismatchException e) {
                System.out.println("Incorrect value");
            }
            switch (caseNumber) {
                case 0: {
                    Menu.mainSwitch();
                }
                case 1: {
                    basicTasks.task1();
                    break;
                } case 2:{
                    basicTasks.task2();
                    break;
                } case 3:{
                    basicTasks.task3();
                    break;
                } case 4:{
                    basicTasks.task4();
                    break;
                }
                case 5: {
                    basicTasks.task5();
                    break;
                }
                case 6: {
                    basicTasks.task6();
                    break;
                }
                case 7: {
                    basicTasks.task7();
                    break;
                }
                case 8: {
                    basicTasks.task8();
                    break;
                }
                case 9: {
                    basicTasks.task9();
                    break;
                }
                case 10: {

                }
                case 11: {

                }
                default:
                    System.out.println("Incorrect value!");
            }
            Menu.basicMenu();
        }
    }
}
