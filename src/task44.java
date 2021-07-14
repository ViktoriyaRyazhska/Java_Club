import java.util.Scanner;
import java.util.stream.IntStream;

public class task44 {
    public static int summation(int n) {
        return IntStream.rangeClosed(1, n)
                .sum();
    }

    public static void execute(Scanner sc) {
        System.out.println("This program finds the summation of every number from 1 to num");
        System.out.println("Enter your number: ");
        int n = sc.nextInt();
        System.out.println("Your result is " + summation(n));
    }
}
