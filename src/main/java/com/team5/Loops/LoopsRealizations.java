package com.team5.Loops;

import com.team5.Menu.Input;
import com.team5.Menu.Menu;
import java.util.InputMismatchException;

public class LoopsRealizations {

    public static void loopsRealization(){
        LoopsTasks loopsTasks = new LoopsTasks();
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
            } case 32: {
                loopsTasks.task32IO();
                break;
            } case 33:{
                loopsTasks.task33IO();
                break;
            } case 34:{
                loopsTasks.task34IO();
                break;
            } case 35:{
                loopsTasks.task35IO();
                break;
            } case 36:{

            } case 37:{

            } case 38:{

            } case 39:{

            } case 40:{
                loopsTasks.task40IO();
                break;
            } case 41:{
                loopsTasks.task41IO();
                break;
            } case 42:{
                loopsTasks.task42IO();
                break;
            } case 43:{
                loopsTasks.task43IO();
                break;
            } case 44:{
                loopsTasks.task44IO();
                break;
            } case 45:{
                loopsTasks.task45();
                break;
            } case 46:{
                loopsTasks.task46IO();
                break;
                }
                default:
                    System.out.println("Incorrect value!");
            }
            Menu.loopsMenu();
        }
    }
}
