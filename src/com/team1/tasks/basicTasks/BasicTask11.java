package com.team1.tasks.basicTasks;


import com.team1.IRunTask;

import java.util.Scanner;

public class BasicTask11 implements IRunTask {
    private int temp;

    public BasicTask11() {
    }

    public static String weatherInfo(int temp) {
        double c = convertToCelsius(temp);
        if (c < 0)
            return (c + " is freezing temperature");
        else
            return (c + " is above freezing temperature");
    }

    public static double convertToCelsius(double fahrenheit) {
        System.out.println(fahrenheit);

        double celsius = (fahrenheit - 32) * (5 / 9.0);
        System.out.println(celsius);
        return celsius;
    }

    @Override
    public void execute() {
        boolean mark = false;
        System.out.println("Input to integer temperature you want to convert to fahrenheit !");
        do {
            try {
                Scanner sc = new Scanner(System.in);
                temp = sc.nextInt();
                mark = true;
            } catch (Exception exception) {
                System.out.println("You have input illegal character, try again!");
                continue;
            }
        } while (mark == false);
        System.out.println(weatherInfo(temp));
    }
}
