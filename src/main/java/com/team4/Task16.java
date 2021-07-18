//Task 16 (Two fighters, one winner.)
package com.team4;
public class Task16 {
  public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
    Fighter a=fighter1, b=fighter2;
    if (firstAttacker.equals(fighter2.name)) {
      a = fighter2; b = fighter1;
    }
    while (true) {
      if ((b.health -= a.damagePerAttack) <= 0) return a.name;  // a wins
      if ((a.health -= b.damagePerAttack) <= 0) return b.name;  // b wins
    }
  }

  public static void execute(){
    System.out.println("Input the name, health and damagePerAttack of first Fighter : ");
    String name1 = MyMain.scanner.nextLine();
    int health1 = MyMain.scanner.nextInt();
    int damage1 = MyMain.scanner.nextInt();
    System.out.println("Input the name, health and damagePerAttack of second Fighter : ");
    String name2 = MyMain.scanner.nextLine();
    int health2 = MyMain.scanner.nextInt();
    int damage2 = MyMain.scanner.nextInt();
    Fighter fighter1 = new Fighter(name1, health1, damage1);
    Fighter fighter2 = new Fighter(name2, health2, damage2);
    System.out.println("Input who will be firstAttacker : ");
    String name3 = MyMain.scanner.nextLine();
    System.out.println(Task16.declareWinner(fighter1, fighter2, name3));
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