package com.team5.Classes;

import com.team5.Menu.Input;

public class ClassesTasks {

    public String task16(Fighter fighter1,Fighter fighter2,String fName) {
        Fighter a=fighter1, b=fighter2;
        if (fName.equals(fighter2.name)) {
            a = fighter2; b = fighter1;
        }
        for(;;){
            if ((b.health -= a.damagePerAttack) <= 0) return a.name;
            if ((a.health -= b.damagePerAttack) <= 0) return b.name;
        }

    }
    public void task16IO() {
        System.out.print("Fighter 1 name - ");
        String name1 = Input.getStrInput();
        System.out.print("Fighter 1 health - ");
        int h1 = Input.getIntegerInput();
        System.out.print("Fighter 1 damage - ");
        int d1 = Input.getIntegerInput();
        System.out.print("Fighter 2 name - ");
        String name2 = Input.getStrInput();
        System.out.print("Fighter 2 health - ");
        int h2 = Input.getIntegerInput();
        System.out.print("Fighter 2 damage - ");
        int d2 = Input.getIntegerInput();
        System.out.print("First attacker name - ");
        String fName=Input.getStrInput();
        Fighter fighter1 = new Fighter(name1, h1, d1);
        Fighter fighter2 = new Fighter(name2, h2, d2);
        System.out.println(task16(fighter1,fighter2,fName));
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
