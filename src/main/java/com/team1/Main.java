package com.team1;


import com.team1.tasks.basicTasks.BasicMenu;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

       BasicMenu basicMenu = new BasicMenu();

      int task = -1;
        boolean mark = false;
        while (true) {
            basicMenu.printListOfTasks();
            do {
                try {
                    Scanner sc = new Scanner(System.in);
                    task = sc.nextInt();

                    mark = true;
                } catch (Exception exception) {
                    System.out.println("You have input illegal character, try again!");

                }
            } while (mark == false);
            basicMenu.menu(task);


        }
    }
}
