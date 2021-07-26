package com.team1.tasks.loops;

import com.team1.IRunTask;

import java.util.Arrays;
import java.util.Scanner;

public class SheepCounter implements IRunTask {

    Scanner sc;

    public SheepCounter(Scanner sc) {
        this.sc = sc;

    }

    private Boolean[] arrayOfSheep;
    private int size;

    public static int countSheep(Boolean[] arrayOfSheep) {
        int ans = 0;
        for (Boolean ofSheep : arrayOfSheep) {
            if (ofSheep == Boolean.TRUE) {
                ans++;
            } else if (ofSheep != null) {
                System.out.println("NULL");
            }
        }
        return ans;
    }

    @Override
    public void execute() {
        boolean mark = false;
        System.out.println("Sheep count");
        int b;
        do {
            try {
                System.out.println("Input size or sheep array");
                size = sc.nextInt();

                System.out.println("Press 0(not sheep) or 1(sheep)  to add sheep to array ");

                for (int i = 0; i < size; i++) {
                    b = sc.nextInt();
                    if (b == 1) {
                        arrayOfSheep[i] = true;
                    } else arrayOfSheep[i] = false;

                }
                mark = true;
            } catch (Exception exception) {
                System.out.println("You have input illegal character, try again!");
                continue;
            }
        } while (mark == false);
        System.out.println(countSheep(arrayOfSheep));
    }
}
