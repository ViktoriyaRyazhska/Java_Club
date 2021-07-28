package com.team1.classesTasks.task5;

import java.util.Scanner;

public class Task5 {
    static String nameFighter1, nameFighter2;
    static int healthFighter1, healthFighter2;
    static int damagePerAttackFighter1, damagePerAttackFighter2;

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Classes Task 5: Two fighters, one winner.");
        System.out.println("https://www.codewars.com/kata/two-fighters-one-winner/");
        System.out.println();

        System.out.println("Program returns the name of the winner in a fight between two fighters.");
        System.out.println("Each fighter takes turns attacking the other and whoever kills the other first is victorious.");
        System.out.println();

        System.out.println("Creating the fighters...");
        System.out.println();


        //Creating the first fighter
        System.out.print("Enter the first fighter's name: ");
        Scanner fighter1 = new Scanner(System.in);
        nameFighter1 = fighter1.nextLine();

        System.out.print(String.format("Enter health value of the \"%s\": ", nameFighter1));
        try {
            healthFighter1 = fighter1.nextInt();
        } catch (Exception e) {
            System.out.println("Please enter only integer value higher then 0.");
            return;
        }

        System.out.print(String.format("Enter the value of the \"%s's\" damage per attack: ", nameFighter1));
        try {
            damagePerAttackFighter1 = fighter1.nextInt();
        } catch (Exception e) {
            System.out.println("Please enter only integer value higher then 0.");
            return;
        }

        new Fighter(nameFighter1, healthFighter1, damagePerAttackFighter1);


        //Creating the second fighter
        System.out.print("Enter the second fighter's name: ");
        Scanner fighter2 = new Scanner(System.in);
        nameFighter2 = fighter2.nextLine();

        System.out.print(String.format("Enter health value of the \"%s\": ", nameFighter2));
        try {
            healthFighter2 = fighter2.nextInt();
        } catch (Exception e) {
            System.out.println("Please enter only integer value higher then 0.");
            return;
        }

        System.out.print(String.format("Enter the value of the \"%s's\" damage per attack: ", nameFighter2));
        try {
            damagePerAttackFighter2 = fighter2.nextInt();
        } catch (Exception e) {
            System.out.println("Please enter only integer value higher then 0.");
        }

        new Fighter(nameFighter2, healthFighter2, damagePerAttackFighter2);


        //Fight
        System.out.println();
        System.out.println("Fight!!!");

        for (int i = 0; ; i++) {
            while ((healthFighter1 > 0) || (healthFighter2 > 0)) {
                //Attack Fighter1
                System.out.println();
                System.out.print("Attack #" + ++i + ": ");
                System.out.println(String.format("\"%s\" hits the \"%s\" with %d points of damage.",
                        nameFighter1, nameFighter2, damagePerAttackFighter1));

                healthFighter2 = healthFighter2 - damagePerAttackFighter1;
                System.out.println(String.format("\"%s\" has %d heath points", nameFighter2, healthFighter2));

                if (healthFighter2 <= 0) {
                    System.out.println(String.format("\"%s\" was defeated!", nameFighter2));
                    System.out.println(String.format("\"%s\" is the WINNER!!!", nameFighter1));
                    return;
                } else {
                    //Attack Fighter2
                    System.out.println();
                    System.out.print("Attack #" + ++i + ": ");
                    System.out.println(String.format("\"%s\" hits the \"%s\" with %d points of damage.",
                            nameFighter2, nameFighter1, damagePerAttackFighter2));

                    healthFighter1 = healthFighter1 - damagePerAttackFighter2;
                    System.out.println(String.format("\"%s\" has %d heath points", nameFighter1, healthFighter1));

                    if (healthFighter1 <= 0) {
                        System.out.println(String.format("\"%s\" was defeated!", nameFighter1));
                        System.out.println(String.format("\"%s\" is the WINNER!!!", nameFighter2));
                        return;
                    }
                }
            }
        }
    }
}
