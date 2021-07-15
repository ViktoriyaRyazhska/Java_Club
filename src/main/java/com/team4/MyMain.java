package com.team4;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        instruction();
        System.out.print("Input your number of task : ");
        Scanner scanner = new Scanner(System.in);
        int question = scanner.nextInt();
        switch (question){
            case 1:
                System.out.println("Input your number ");
                scanner = new Scanner(System.in);
                int n = scanner.nextInt();
                System.out.println(Task1.doubleInteger(n));
            case 2:
                System.out.println("Input two numbers :");
                scanner = new Scanner(System.in);
                int n1 = scanner.nextInt();
                scanner = new Scanner(System.in);
                int n2 = scanner.nextInt();
                System.out.println(Task2.multiply(n1, n2));
            case 3:
                System.out.println("Input length, width and height :");
                scanner = new Scanner(System.in);
                double n3 = scanner.nextDouble();
                scanner = new Scanner(System.in);
                double n4 = scanner.nextDouble();
                scanner = new Scanner(System.in);
                double n5 = scanner.nextDouble();
                System.out.println(Task3.getVolumeOfCuboid(n3, n4, n5));
            case 4:
                System.out.println("Input wallLength and pixelSize :");
                scanner = new Scanner(System.in);
                int n6 = scanner.nextInt();
                scanner = new Scanner(System.in);
                int n7 = scanner.nextInt();
                System.out.println(Task4.isDivisible(n6, n7));
            case 5:
                System.out.println("Input your name :");
                scanner = new Scanner(System.in);
                String n8 = scanner.nextLine();
                System.out.println(Task5.greet(n8));
            case 6:
                System.out.println("Input your number ");
                scanner = new Scanner(System.in);
                int n9 = scanner.nextInt();
                System.out.println(Task6.toBinary(n9));
            case 7:
                System.out.println("Input three numbers :");
                scanner = new Scanner(System.in);
                int n10 = scanner.nextInt();
                scanner = new Scanner(System.in);
                int n11 = scanner.nextInt();
                scanner = new Scanner(System.in);
                int n12 = scanner.nextInt();
                System.out.println(Task3.getVolumeOfCuboid(n10, n11, n12));
            case 8:
                System.out.println("Input your Year ");
                scanner = new Scanner(System.in);
                int n13 = scanner.nextInt();
                System.out.println(Task8.century(n13));
            case 9:
                System.out.println("Input your number ");
                scanner = new Scanner(System.in);
                int n14 = scanner.nextInt();
                System.out.println(Task9.makeNegative(n14));
            case 10:
                System.out.println("Input your age ");
                scanner = new Scanner(System.in);
                int n15 = scanner.nextInt();
                System.out.println(Task10.datingRange(n15));
            case 11:
                System.out.println("Input your temperature ");
                scanner = new Scanner(System.in);
                double n16 = scanner.nextDouble();
                System.out.println(Task11.weatherInfo(n16));
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:





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
        System.out.print("\n\n\n");
    }
}
