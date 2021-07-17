package com.team5.Classes;

import com.team5.Menu.Input;

public class ClassesTasks {

    public String task16() {
        String name1 = Input.getStrInput();
        System.out.println("Fighter 1 health");
        int h1 = Input.getIntegerInput();
        System.out.println("Fighter 1 damage");
        int d1 = Input.getIntegerInput();
        System.out.println("Fighter 2 name");
        String name2 = Input.getStrInput();
        System.out.println("Fighter 2 health");
        int h2 = Input.getIntegerInput();
        System.out.println("Fighter 2 damage");
        int d2 = Input.getIntegerInput();
        System.out.println("First attacker name");
        String fName=Input.getStrInput();
        Fighter fighter1 = new Fighter(name1, h1, d1);
        Fighter fighter2 = new Fighter(name2, h2, d2);

        for(;;){
            if ((fighter1.health -= fighter2.damagePerAttack) <= 0) {
                System.out.println("Winner-" + fighter2.name);
                return "Winner-" + fighter2.name;
            }
            if ((fighter2.health -= fighter1.damagePerAttack) <= 0) {
                System.out.println("Winner-" + fighter1.name);
                return "Winner-" + fighter1.name;
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
