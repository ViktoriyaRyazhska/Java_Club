import java.util.Scanner;

public class task42 {
    public static int TwiceAsOld(int dadYears, int sonYears){
        return Math.abs(2 * sonYears - dadYears);
    }

    public static void execute(Scanner sc) {
        System.out.println("This method calculates how many years ago the father \n" +
                "was twice as old as his son \n" +
                "(or in how many years he will be twice as old).");
        System.out.println("Enter how old your father is: ");
        int dadYears = sc.nextInt();
        System.out.println("Enter how old you are: ");
        int sonYears = sc.nextInt();
        int result = TwiceAsOld(dadYears, sonYears);
        System.out.println("Your result: " + result);
    }
}
