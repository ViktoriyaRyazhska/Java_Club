import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class task16 {
    public static String attack(Fighter fighter1, Fighter fighter2) {
        while (fighter2.health > 0 && fighter1.health > 0) {
            fighter2.health = fighter2.health - fighter1.damagePerAttack;
            if (fighter2.health <= 0) {
                return fighter1.name;
            }
            fighter1.health = fighter1.health - fighter2.damagePerAttack;
            if (fighter1.health <= 0) {
                return fighter2.name;
            }
        }
        throw new RuntimeException();
    }
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        if (firstAttacker.equals(fighter1.name)) {
            return attack(fighter1, fighter2);
        } else {
            return attack(fighter2, fighter1);
        }

    }

    public static void execute(Scanner sc) {
        System.out.println("This program returns the name of the winner in a fight between two fighters.\n" +
                "\n" +
                "Each fighter takes turns attacking the other and whoever kills the other first is victorious. \n" +
                "Death is defined as having health <= 0.");
        System.out.println("Enter name of first fighter: ");
        String firstFighterName = sc.next();
        System.out.println("Enter his health (it should be over 10): ");
        int firstFighterHealth = sc.nextInt();
        System.out.println("Damage will assign with random");
        int damageFirstFighterHealth = ThreadLocalRandom.current().nextInt(5);
        System.out.println("Enter name of second fighter: ");
        String secondFighterName = sc.next();
        System.out.println("Enter his health (it should be over 10): ");
        int secondFighterHealth = sc.nextInt();
        System.out.println("Damage will assign with random");
        int damageSecondFighterHealth = ThreadLocalRandom.current().nextInt(5);
        System.out.println("Enter name of fighter who attacks first: ");
        String firstAttackerName = sc.next();
        if (firstAttackerName.equals(firstFighterName) || secondFighterName.equals(secondFighterName)) {
            System.out.println("Lets find out who is a winner....");
        } else {
            throw new RuntimeException("You passed wrong name who attacks first");
        }
        String result = declareWinner(new Fighter(firstFighterName, firstFighterHealth, damageFirstFighterHealth),
                new Fighter(secondFighterName, secondFighterHealth, damageSecondFighterHealth), firstAttackerName);
        System.out.println("Winner is " + result);
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