import java.util.Scanner;

public class task46 {
    public static int makeMove(int sticks) {
        return sticks % 4 == 0 ? 1 : sticks % 4;
    }

    public static void execute(Scanner sc) {
        System.out.println("In this game, there are 21 sticks lying in a pile. \n" +
                "Players take turns taking 1, 2, or 3 sticks. \n" +
                "The last person to take a stick wins.");
        System.out.println("Enter number of sticks: ");
        int sticks = sc.nextInt();
        int result = makeMove(sticks);
        System.out.println("Your result is " + result);
    }
}
