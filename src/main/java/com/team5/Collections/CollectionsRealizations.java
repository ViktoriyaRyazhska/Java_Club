package com.team5.Collections;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CollectionsRealizations {

    public static void collectionsRealization(){
        CollectionsTasks collectionsTasks = new CollectionsTasks();
        Scanner input = new Scanner(System.in);

        int caseNumber = 0;
        try {
            caseNumber = input.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Incorrect value");
        }        switch (caseNumber) {
            case 69: {

            } case 70:{

            } case 71:{

            } case 72:{

            } default:
                System.out.println("Incorrect value!");
        }
    }
}
