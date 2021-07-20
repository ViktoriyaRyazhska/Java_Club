package com.team1.tasks.basicTasks;

import java.util.Scanner;

public class BasicTask12 implements com.team1.IRunTask {

    Scanner console = new Scanner(System.in);

    @Override
    public void execute() {
        System.out.println();
        System.out.println("Basic program Task 12: Exes and Ohs");
        System.out.println("https://www.codewars.com/kata/55908aad6620c066bc00002a/train/java");
        System.out.println();

        System.out.println("Check to see if a string has the same amount of 'x's and 'o's.");
        System.out.println("The method must return a boolean and be case insensitive.");
        System.out.println("The string can contain any char.");
        System.out.println();
        System.out.println("Please enter your string with any symbols...");

        getXO(console.nextLine());
    }

    public static boolean getXO (String input) {
        int countSmallX = 0, countBigX = 0, countSmallO = 0, countBigO = 0;

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);

            if (symbol == 'x') {
                countSmallX += 1;
            } else if (symbol == 'X') {
                countBigX += 1;
            } else if (symbol == 'o') {
                countSmallO += 1;
            } else if (symbol == 'O') {
                countBigO += 1;
            }
        }

        int sum = countBigO + countSmallO + countBigX + countSmallX;

        if (sum == 0) {
            System.out.println("\"" + input + "\" => true");
            return true;
        } else if ((countSmallX > 0) && (countSmallX == countSmallO)) {
            System.out.println("\"" + input + "\" => true");
            return true;
        } else if ((countBigX > 0) && (countBigX == countBigO)) {
            System.out.println("\"" + input + "\" => true");
            return true;
        } else {
            System.out.println("\"" + input + "\" => false");
            return false;
        }
    }
}