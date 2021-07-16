package com.team5.Collections;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
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

            }
            case 71:{
                System.out.print("Enter array size - ");

                int n = input.nextInt();
                List<Integer> listOfNumbers = new ArrayList<>();
                for (int i = 0; i < n ; i++) {
                    System.out.print("Enter array elem - ");
                    listOfNumbers.add(input.nextInt());
                }
                collectionsTasks.task71(n,listOfNumbers);
                break;

            }
            case 72:{

            } default:
                System.out.println("Incorrect value!");
        }
    }
}
