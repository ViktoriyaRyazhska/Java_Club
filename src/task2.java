import java.util.Scanner;

public class task2 {
    public static int multiply(int num1, int num2) {
        return num1*num2;
    }
    public static void execute(Scanner sc) {
        System.out.println("This method multiplies two integers, please enter one int:");
        int first = sc.nextInt();
        System.out.println("Okay, now put me one more int: ");
        int second = sc.nextInt();
        int result = task2.multiply(first, second);
        System.out.println("Here your result: " + result);
    }

}
