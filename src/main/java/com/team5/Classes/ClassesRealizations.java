package com.team5.Classes;

import com.team5.Menu.Input;
import com.team5.Menu.Menu;

import java.util.InputMismatchException;

public class ClassesRealizations {

    public static void classesRealization() {
        ClassesTasks classesTasks = new ClassesTasks();
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
                case 12: {

                } case 13: {

                } case 14: {
                    Fraction fraction = new Fraction(15, 56);
                    fraction.add(fraction);
                    break;
                } case 15: {

                }
                case 16: {
                    classesTasks.task16();
                    break;
                }
                case 17: {
                    Block block = new Block();
                    block.getVolume();
                    block.getSurfaceArea();
                    break;
                }
                default:
                    System.out.println("Incorrect value!");
            }
            Menu.classesMenu();
        }
    }

}
