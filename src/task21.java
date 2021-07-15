import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class task21 {
    public static String bonusTime(final int salary, final boolean bonus) {
        return bonus ? "£" + salary * 10 : "£" + salary;
    }

    public static void execute(Scanner sc) {
        System.out.println("This program takes in two arguments (salary, bonus). Salary will be an integer, and bonus a boolean." +
                "\nIf bonus is true, the salary should be multiplied by 10. \n" +
                "If bonus is false, the fatcat did not make enough money and must receive only his stated salary..");
        System.out.println("Enter your salary: ");
        int salary = sc.nextInt();
        System.out.println("We will make our decision by random :) he he");
        boolean bonus = ThreadLocalRandom.current().nextBoolean();
        if (bonus) {
            System.out.println("You are lucky! This is your bonus " + bonusTime(salary, bonus));
        } else {
            System.out.println("Sorry, unfortunately you were left without a bonus");
        }
    }
}
