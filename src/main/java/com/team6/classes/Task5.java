package com.team6.classes;

import java.util.stream.IntStream;

class Task5 {

    public static void main(String[] args) {

        // Lew
        String f1 = fight(
                new Fighter("Lew", 10, 2),
                new Fighter("Harry", 5, 4),
                "Lew");

        // Harry
        String f2 = fight(
                new Fighter("Lew", 10, 2),
                new Fighter("Harry", 5, 4),
                "Harry");

        // Herald
        String f3 = fight(
                new Fighter("Harald", 20, 5),
                new Fighter("Harry", 5, 4),
                "Harry");

        // Herald
        String f4 = fight(
                new Fighter("Harald", 20, 5),
                new Fighter("Harry", 5, 4),
                "Harald");


        System.out.println("F1 = " + f1);
        System.out.println("F2 = " + f2);
        System.out.println("F3 = " + f3);
        System.out.println("F4 = " + f4);
    }

    private static String fight(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        Fighter first = (fighter1.name.equals(firstAttacker) ? fighter1 : fighter2);
        Fighter second = (fighter2.name.equals(firstAttacker) ? fighter1 : fighter2);
        Fighter winner = null;

        int i = 1;
        while (true) {

            if (isPrime(i))
                second.health -= first.damagePerAttack;
            else
                first.health -= second.damagePerAttack;

            i++;

            if (first.health <= 0) {
                winner = second;
                break;
            }
            if (second.health <= 0) {
                winner = first;
                break;
            }

        }
        return winner.name;
    }

    private static boolean isPrime(int n) {
        return IntStream.rangeClosed(2, n/2).noneMatch(i -> n%i == 0);
    }

    static class Fighter {
        public String name;
        public int health, damagePerAttack;
        public Fighter(String name, int health, int damagePerAttack) {
            this.name = name;
            this.health = health;
            this.damagePerAttack = damagePerAttack;
        }
    }
}

