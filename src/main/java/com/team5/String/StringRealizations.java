package com.team5.String;

import com.team5.Menu.Input;
import com.team5.Menu.Menu;
import java.util.InputMismatchException;

public class StringRealizations {

    public static void StringRealization() {
        StringTasks stringTasks = new StringTasks();
        for (; ; ) {

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
                    stringTasks.task55IO();
                    break;
                }
                case 56: {
                    stringTasks.task56IO();
                    break;
                }
                case 57: {
                    stringTasks.task57IO();
                    break;
                }
                case 58: {
                    stringTasks.task58IO();
                    break;
                }
                case 59: {
                    stringTasks.task59IO();
                    break;
                }
                case 60: {
                    stringTasks.task60IO();
                    break;
                }
                case 61: {
                    stringTasks.task61IO();
                    break;
                }
                case 62: {
                    stringTasks.task62IO();
                    break;
                }
                case 63: {
                    stringTasks.task63IO();
                    break;
                }
                case 64: {
                    stringTasks.task64();
                    break;
                }
                case 65: {
                    stringTasks.task65();
                    break;
                }
                case 66: {
                    stringTasks.task66();
                    break;
                }
                case 67: {
                    stringTasks.task67();
                    break;
                }
                case 68: {
                    stringTasks.task68();
                    break;
                }
                default:
                    System.out.println("Incorrect value!");
            }
            Menu.stringMenu();
        }
    }
}
