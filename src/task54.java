import java.util.Scanner;

public class task54 {
    public static int opposite(int number) {
        if (number == 0) {
            return 0;
        } if (number > 0) {
            return number * -1;
        } else {
            return Math.abs(number);
        }
    }

    public static void execute(Scanner sc) {
        System.out.println("This method reads number and returns opposite.");
        System.out.println("Enter your number: ");
        int n = sc.nextInt();
        int result = opposite(n);
        System.out.println("Opposite number to " + n + " is " + result);
    }
}
