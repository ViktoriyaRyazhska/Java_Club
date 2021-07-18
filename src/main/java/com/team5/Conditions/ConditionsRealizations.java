package com.team5.Conditions;

import com.team5.Menu.Input;
import com.team5.Menu.Menu;

import java.util.InputMismatchException;

public class ConditionsRealizations {

    public static void conditionsRealization() {
        ConditionsTasks conditionsTasks = new ConditionsTasks();
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
            }
            case 18: {
                conditionsTasks.task18IO();
                break;
            } case 19:{
                conditionsTasks.task19IO();
                break;
            } case 20:{
                conditionsTasks.task20IO();
                break;
            } case 21:{
                conditionsTasks.task21IO();
                break;
            } case 22:{
                conditionsTasks.task22();
                break;
            } case 23:{
                conditionsTasks.task23();
                break;
            } case 24:{
                conditionsTasks.task24();
                break;
            } case 25:{
               conditionsTasks.task25();
               break;
            } case 26:{
                conditionsTasks.task26IO();
                break;
            } case 27:{
                conditionsTasks.task27IO();
                break;
            } case 28:{
                conditionsTasks.task28IO();
                break;
            } case 29:{

                }
                case 30: {

                }
                case 31: {

                }
                default:
                    System.out.println("Incorrect value!");
            }
            Menu.conditionsMenu();
        }
    }
}
