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
                    basicTasks.task1IO();
                    break;
                } case 2:{
                    basicTasks.task2IO();
                    break;
                } case 3:{
                    basicTasks.task3IO();
                    break;
                } case 4:{
                    basicTasks.task4IO();
                    break;
                }
                case 5: {
                    basicTasks.task5IO();
                    break;
                }
                case 6: {
                    basicTasks.task6IO();
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
