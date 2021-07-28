package com.team1.classesTasks.task5;

public class Fighter {
    private String name;
    private int health, damagePerAttack;

    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;

        if (health <= 0) {
            System.out.println(String.format("Health of the fighter \"%s\" must be higher then 0", name));
        }

        if (damagePerAttack <= 0) {
            System.out.println(String.format("Damage per attack of the fighter \"%s\" must be higher then 0", name));
        }
    }
}
