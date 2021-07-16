package com.team1;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Menu basicMenu = new Menu();
        Scanner sc = null;

        int task = -1;
        boolean mark = false;
        while (true) {
            basicMenu.printListOfTasks();
            do {
                try {
                    sc = new Scanner(System.in);
                    task = sc.nextInt();

                    mark = true;
                    sc.close();
                } catch (Exception exception) {
                    System.out.println("You have input illegal character, try again!");

                }
            } while (mark == false);
            basicMenu.menu(task, sc);


        }
    }
}