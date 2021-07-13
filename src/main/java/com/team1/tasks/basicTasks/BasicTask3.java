package com.team1.tasks.basicTasks;

import com.team1.IRunTask;

import java.util.Scanner;

public class BasicTask3 implements IRunTask {

    private double length;
    private double width;
    private double height;

    public BasicTask3() {
    }

    public static double getVolumeOfCuboid(final double length, final double width, final double height) {
        return length * width * height;
    }

    @Override
    public void execute() {
        boolean mark = false;
        System.out.println("Input length, width, height to find volume of cuboid!");
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Input first length!");
                length = sc.nextDouble();
                System.out.println("Input second width!");
                width = sc.nextDouble();
                System.out.println("Input second height!");
                height = sc.nextDouble();
                mark = true;
            } catch (Exception exception) {
                System.out.println("You have input illegal character, try again!");
                continue;
            }
        } while (mark == false);
        System.out.println(getVolumeOfCuboid(length, width, height));
    }
}
