package com.team5.Menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    public static final Scanner scanner = new Scanner(System.in);

    public static int getIntegerInput() {
        int input = 0;
        try {
            input = scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Incorrect value. Please enter integer.");
        }
        return input;
    }

    public static String getStrInput() {
        String input = "";
        try {
            input = scanner.next();
        }catch (InputMismatchException e){
            System.out.println("Incorrect value. Please enter string.");
        }
        return input;
    }

    public static boolean getBoolInput() {
        boolean input = false;
        try {
            input = scanner.nextBoolean();
        }catch (InputMismatchException e){
            System.out.println("Incorrect value. Please enter true or false.");
        }
        return input;
    }

    public static char getCharInput(){
        char input = 0;
        try {
            input = scanner.next().charAt(0);
        }catch (InputMismatchException e){
            System.out.println("Incorrect value. Please enter character.");
        }
        return input;
    }

}
