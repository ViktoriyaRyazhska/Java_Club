package com.team5;

import com.team5.Basic.BasicRealizations;
import com.team5.Classes.ClassesRealizations;
import com.team5.Collections.CollectionsRealizations;
import com.team5.Conditions.ConditionsRealizations;
import com.team5.Loops.LoopsRealizations;
import com.team5.Menu.Menu;
import com.team5.OOP.OOPRealizations;
import com.team5.String.StringRealizations;


public class Main {
    public static void main(String[] args) {

        int caseNum;
            caseNum = Menu.menu();
            switch (caseNum) {
                case 1: {
                    Menu.basicMenu();
                    BasicRealizations.basicRealization();
                    break;
                } case 2: {
                    Menu.classesMenu();
                    ClassesRealizations.classesRealization();
                    break;
                } case 3: {
                    Menu.conditionsMenu();
                    ConditionsRealizations.conditionsRealization();
                    break;
                } case 4: {
                    Menu.loopsMenu();
                    LoopsRealizations.loopsRealization();
                    break;
                } case 5: {
                    Menu.oopMenu();
                    OOPRealizations.OOPRealization();
                    break;
                } case 6: {
                    Menu.stringMenu();
                    StringRealizations.StringRealization();
                    break;
                } case 7: {
                    Menu.collectionsMenu();
                    CollectionsRealizations.collectionsRealization();
                    break;
                } case 0: {
                    System.out.println("Good Bye");
                    break;
                } default:
                    System.out.println("Incorrect value!");

            }
    }
}