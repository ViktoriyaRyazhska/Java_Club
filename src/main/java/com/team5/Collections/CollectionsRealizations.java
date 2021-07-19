package com.team5.Collections;

import com.team5.Menu.Input;
import com.team5.Menu.Menu;
import java.util.InputMismatchException;


public class CollectionsRealizations {

    public static void collectionsRealization(){
        CollectionsTasks collectionsTasks = new CollectionsTasks();
        for (;;) {

        int caseNumber = 0;
        try {
            caseNumber = Input.getIntegerInput();
        }catch (InputMismatchException e){
            System.out.println("Incorrect value");
        }
        switch (caseNumber) {
            case 0: {
                Menu.mainSwitch();
            } case 69: {
                collectionsTasks.task69();
                break;
            } case 70:{
                collectionsTasks.task70IO();
                break;
            } case 71:{
                collectionsTasks.task71IO();
                break;
            } case 72:{

            } default:
                System.out.println("Incorrect value!");
            }
            Menu.collectionsMenu();
        }
    }
}
