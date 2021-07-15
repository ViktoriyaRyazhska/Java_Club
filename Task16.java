//Task 16 (Two fighters, one winner.)

public class Kata {
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
}
