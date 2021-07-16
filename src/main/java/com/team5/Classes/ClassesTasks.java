package com.team5.Classes;

public class ClassesTasks {

    public void task16(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        Fighter a=fighter1, b=fighter2;
        if (firstAttacker.equals(fighter2.name)) {
            a = fighter2; b = fighter1;
        }
        for(;;){
            if ((b.health -= a.damagePerAttack) <= 0) {
                System.out.println("Winner-" + a.name);
                break;
            }
            if ((a.health -= b.damagePerAttack) <= 0) {
                System.out.println("Winner-" + b.name);
                break;
            }
        }

    }
}
class Fighter {
    public String name;
    public int health, damagePerAttack;
    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }
}
