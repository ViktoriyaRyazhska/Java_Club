package com.team5.String;

import com.team5.Menu.Input;
import com.team5.Menu.Menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StringRealizations {

    public static void StringRealization() {
        StringTasks stringTasks = new StringTasks();
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
                case 51: {

                }
                case 52: {

                }
                case 53: {

                }
                case 54: {

                }
                case 55: {
                    stringTasks.task55();
                    break;
                }
                case 56: {
                    stringTasks.task56();
                    break;
                }
                case 57: {
                    stringTasks.task57();
                    break;
                }
                case 58: {
                    stringTasks.task58();
                    break;
                }
                case 59: {

                }
                case 60: {

                }
                case 61: {

                }
                case 62: {

                }
                case 63: {
                    System.out.println("Test");
                }
                case 64: {
                    stringTasks.task14();
                    break;
                }
                case 65: {
                    stringTasks.task15();
                    break;
                }
                case 66: {
                    stringTasks.task16();
                    break;
                }
                case 67: {
                    stringTasks.task17();
                    break;
                }
                case 68: {
                    stringTasks.task18();
                    break;
                }
                default:
                    System.out.println("Incorrect value!");
            }
            Menu.stringMenu();
        }
    }
}
