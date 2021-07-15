import java.util.Scanner;

public class task23 {
    public static String rps(String p1, String p2) {
        if (p1 == p2)
            return "Draw!";

        if (((p1 == "rock") && (p2 == "scissors")) ||
                ((p1 == "scissors") && (p2 == "paper")) ||
                ((p1 == "paper") && (p2 == "rock")))
        {
            return "Player 1 won!";
        }
        else
        {
            return "Player 2 won!";
        }
    }
    public static void execute(Scanner sc) {
        System.out.println("This is a game rock,paper,scissors");
        System.out.println("First player enter");
        String step1 = sc.next();
        System.out.println("Second player enter");
        String step2 = sc.next();
        String result = rps(step1, step2);


        System.out.println(result);
    }
}
