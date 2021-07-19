package com.team4;

import java.util.Arrays;
import java.util.Scanner;

public class MyMain {
    public static Scanner scanner = new Scanner(System.in);
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        instruction();
        System.out.print("Input your number of task : ");

        int question = scanner.nextInt();
        switch (question) {
            case 1 -> Task1.execute();
            case 2 -> Task2.execute();
            case 3 -> Task3.execute();
            case 4 -> Task4.execute();
            case 5 -> Task5.execute();
            case 6 -> Task6.execute();
            case 7 -> Task7.execute();
            case 8 -> Task8.execute();
            case 9 -> Task9.execute();
            case 10 -> Task10.execute();
            case 11 -> Task11.execute();
            case 12 -> Task12.execute();
            case 13 -> Task13.execute();
            case 14 -> Task14.execute();
            case 15 -> Task15.execute();
            case 16 -> Task16.execute();
            case 17 -> Task17.execute();
            case 18 -> Task18.execute();
            case 19 -> Task19.execute();
            case 20 -> Task20.execute();
            case 21 -> Task21.execute();
            case 22 -> Task22.execute();
            case 23 -> Task23.execute();
            case 24 -> Task24.execute();
            case 25 -> Task25.execute();
            case 26 -> Task26.execute();
            case 27 -> Task27.execute();
            case 28 -> Task28.execute();
            case 29 -> Task29.execute();
            case 30 -> Task30.execute();
            case 31 -> Task31.execute();
            case 32 -> Task32.execute();
            case 33 -> Task33.execute();
            case 34 -> Task34.execute();
            case 35 -> Task35.execute();
            case 36 -> Task36.execute();
            case 42 -> Task42.execute();
            case 45 -> Task45.execute();
            case 46 -> Task46.execute();
            case 48 -> Task48.execute();
            case 49 -> Task49.execute();
            //case 50 -> Task50.execute();
            case 51 -> Task51.execute();
            case 52 -> Task52.execute();
            case 55 -> Task55.execute();
            //case 57 -> Task57.execute();
            case 60 -> Task60.execute();
            case 61 -> Task61.execute();
            case 62 -> Task62.execute();
            default -> System.out.println("There is no such number (((");
        }
    }

    static void instruction(){
        System.out.println("There are tasks(1-72)");
        System.out.println("Task 1 (You Can't Code Under Pressure #1)");
        System.out.println("Task 2 (Function 3 - multiplying two numbers)");
        System.out.println("Task 3 (Volume of a Cuboid)");
        System.out.println("Task 4 (Thinkful - Number Drills: Pixelart planning)");
        System.out.println("Task 5 (Jenny's secret message)");
        System.out.println("Task 6 (Convert to Binary)");
        System.out.println("Task 7 (Beginner Series #2 Clock)");
        System.out.println("Task 8 (Century From Year)");
        System.out.println("Task 9 (Return Negative)");
        System.out.println("Task 10 (Age Range Compatibility Equation)");
        System.out.println("Task 11 (Grasshopper - Debug)");
        System.out.println("Task 12 (Lombok Encapsulation)");
        System.out.println("Task 13 (FIXM: Static electrickery)");
        System.out.println("Task 14 (Fractions class)");
        System.out.println("Task 15 (Simple Drawing Board)");
        System.out.println("Task 16 (Two fighters, one winner.)");
        System.out.println("Task 17 (Building blocks)");
        System.out.println("Task 18 (Opposite number)");
        System.out.println("Task 19 (Is n divisible by x and y?)");
        System.out.println("Task 20 (Convert a Boolean to a String)");
        System.out.println("Task 21 (Do I get a bonus?)");
        System.out.println("Task 22 (How old will I be in 2099?)");
        System.out.println("Task 23 (Rock Paper Scissors!)");
        System.out.println("Task 24 (Basic Mathematical Operations)");
        System.out.println("Task 25 (Opposites Attract)");
        System.out.println("Task 26 (Convert boolean values to strings 'Yes' or 'No'.)");
        System.out.println("Task 27 (Will there be enough space?)");
        System.out.println("Task 28 (The Modulo-3 Sequence)");
        System.out.println("Task 29 (Switch it Up!)");
        System.out.println("Task 30 (Thinkful - Logic Drills: Traffic light)");
        System.out.println("Task 31 (Transportation on vacation)");
        System.out.println("Task 32 (String repeat)");
        System.out.println("Task 33 (Cat years, Dog years)");
        System.out.println("Task 34 (Get the mean of an array)");
        System.out.println("Task 35 (Beginner - Lost Without a Map)");
        System.out.println("Task 36 (Counting sheep...)");
        System.out.println("Task 42 (Twice as old)");
        System.out.println("Task 45 (21-sticks)");
        System.out.println("Task 46 (Reversed Strings)");
        System.out.println("Task 48 (opposite number)");
        System.out.println("Task 49 (replace all Dots)");
        System.out.println("Task 50 (are you playing banjo)");
        System.out.println("Task 51 (remove string spaces)");
        System.out.println("Task 52 (remove string spaces)");
        System.out.println("Task 55 (parse nice int from char problem)");
        System.out.println("Task 57 (abbreviate-a-two-word-name)");
        System.out.println("Task 60 (sort and star)");
        System.out.println("Task 61 (correct the mistakes of the character recognition ssoftware)");
        System.out.println("Task 62 (alternative case)");
        System.out.print("\n\n\n");
    }
}
