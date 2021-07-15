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
                System.out.println("Input your number, stringValue and Object :");
                scanner = new Scanner(System.in);
                int n17 = scanner.nextInt();
                scanner = new Scanner(System.in);
                String n18 = scanner.nextLine();
                scanner = new Scanner(System.in);
                Object n19 = scanner.next();
                System.out.println(new Task12(n17, n18, n19));
            case 13:
                System.out.println("Input your number ");
                scanner = new Scanner(System.in);
                int n20 = scanner.nextInt();
                System.out.println(Task13.INST.plus100(n20));
            case 14:
                System.out.println("Input your numerator and denominator ");
                scanner = new Scanner(System.in);
                long n21 = scanner.nextLong();
                scanner = new Scanner(System.in);
                long n22 = scanner.nextLong();
                Task14 f1 = new Task14(n21, n22);
                System.out.println("Do it again! ");
                scanner = new Scanner(System.in);
                long n23 = scanner.nextLong();
                scanner = new Scanner(System.in);
                long n24 = scanner.nextLong();
                Task14 f2 = new Task14(n23, n24);
                Task14 f3 = f1.add(f2);
                System.out.println(f3.toString());
                System.out.println("Input your object ");
                scanner = new Scanner(System.in);
                Object n25 = scanner.next();
                System.out.println(f3.equals(n25));
            case 15:
                System.out.println("Input your width and height ");
                scanner = new Scanner(System.in);
                int n26 = scanner.nextInt();
                scanner = new Scanner(System.in);
                int n27 = scanner.nextInt();
                Task15 q1 = new Task15(n26, n27);
                System.out.println("Input x1, x2 and y1, y2 ");
                scanner = new Scanner(System.in);
                int x1 = scanner.nextInt();
                scanner = new Scanner(System.in);
                int x2 = scanner.nextInt();
                scanner = new Scanner(System.in);
                int y1 = scanner.nextInt();
                scanner = new Scanner(System.in);
                int y2 = scanner.nextInt();
                System.out.println(q1.draw(x1, y1, x2, y2));
                System.out.println("input x, y and char");
                scanner = new Scanner(System.in);
                int x = scanner.nextInt();
                scanner = new Scanner(System.in);
                int y = scanner.nextInt();
                scanner = new Scanner(System.in);
                char ch = scanner.next().charAt(0);
                System.out.println(q1.fill(x, y, ch));
                System.out.println(q1.drawCanvas());
            case 16:
                System.out.println("Input the name, health and damagePerAttack of first Fighter : ");
                scanner = new Scanner(System.in);
                String name1 = scanner.nextLine();
                scanner = new Scanner(System.in);
                int health1 = scanner.nextInt();
                scanner = new Scanner(System.in);
                int damage1 = scanner.nextInt();
                System.out.println("Input the name, health and damagePerAttack of second Fighter : ");
                scanner = new Scanner(System.in);
                String name2 = scanner.nextLine();
                scanner = new Scanner(System.in);
                int health2 = scanner.nextInt();
                scanner = new Scanner(System.in);
                int damage2 = scanner.nextInt();
                Fighter fighter1 = new Fighter(name1, health1, damage1);
                Fighter fighter2 = new Fighter(name2, health2, damage2);
                System.out.println("Input who will be firstAttacker : ");
                scanner = new Scanner(System.in);
                String name3 = scanner.nextLine();
                System.out.println(Task16.declareWinner(fighter1, fighter2, name3));
            case 17:
                System.out.println("input your width, length and height ");
                int[] params = new int[3];
                scanner = new Scanner(System.in);
                params[0] = scanner.nextInt();
                scanner = new Scanner(System.in);
                params[1] = scanner.nextInt();
                scanner = new Scanner(System.in);
                params[2] = scanner.nextInt();
                Task17 task17 = new Task17(params);
                System.out.println("There are your parameters (w, l, h, Volume and SurfaceArea) : ");
                System.out.println(task17.getWidth());
                System.out.println(task17.getLength());
                System.out.println(task17.getHeight());
                System.out.println(task17.getVolume());
                System.out.println(task17.getSurfaceArea());
            case 18:
                System.out.println("Input your number ");
                scanner = new Scanner(System.in);
                int n28 = scanner.nextInt();
                System.out.println(Task18.opposite(n28));
            case 19:
                System.out.println("Input three numbers ");
                scanner = new Scanner(System.in);
                long n29 = scanner.nextLong();
                scanner = new Scanner(System.in);
                long n30 = scanner.nextLong();
                scanner = new Scanner(System.in);
                long n31 = scanner.nextLong();
                System.out.println(Task19.isDivisible(n29, n30, n31));
            case 20:
                System.out.println("Input your boolean(true or false) ");
                scanner = new Scanner(System.in);
                boolean n32 = scanner.nextBoolean();
                System.out.println(Task20.convert(n32));
            case 21:
                System.out.println("Input your salary and boolean bonus (true or false) ");
                scanner = new Scanner(System.in);
                int n33 = scanner.nextInt();
                scanner = new Scanner(System.in);
                boolean n34 = scanner.nextBoolean();
                System.out.println(Task21.bonusTime(n33, n34));
            case 22:
                System.out.println("Input your birth and yearTo ");
                scanner = new Scanner(System.in);
                int n35 = scanner.nextInt();
                scanner = new Scanner(System.in);
                int n36 = scanner.nextInt();
                System.out.println(Task22.CalculateAge(n35, n36));
            case 23:
                System.out.println("Player 1 input rock, paper or scissors ");
                scanner = new Scanner(System.in);
                String n37 = scanner.nextLine();
                System.out.println("Player 2 input rock, paper or scissors ");
                scanner = new Scanner(System.in);
                String n38 = scanner.nextLine();
                System.out.println(Task23.rps(n37, n38));
            case 24:
                System.out.println("Input +, -, / or *, and two numbers ");
                scanner = new Scanner(System.in);
                String n39 = scanner.nextLine();
                scanner = new Scanner(System.in);
                int n40 = scanner.nextInt();
                scanner = new Scanner(System.in);
                int n41 = scanner.nextInt();
                System.out.println(Task24.basicMath(n39, n40, n41));
            case 25:
                System.out.println("Input flower 1 and flower 2 ");
                scanner = new Scanner(System.in);
                int n42 = scanner.nextInt();
                scanner = new Scanner(System.in);
                int n43 = scanner.nextInt();
                System.out.println(Task25.isLove(n42, n43));
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
        System.out.print("\n\n\n");
    }
}
