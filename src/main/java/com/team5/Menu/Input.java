package com.team5.Menu;

import java.util.Scanner;

public class Input {

    public static final Scanner scanner = new Scanner(System.in);

    public static int getIntegerInput() {
        int input = scanner.nextInt();
        return input;
    }

    public static String getStrInput() {
        String input = scanner.next();
        return input;
    }
}
