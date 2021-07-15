import java.util.Scanner;

public class task51 {
    public static String numberToString(int num) {
        return String.valueOf(num);
    }

    public static void execute(Scanner sc) {
        System.out.println("This program convert int to String");
        System.out.println("Enter int: ");
        int num = sc.nextInt();
        System.out.println("numberToString(num).getClass() = " + numberToString(num).getClass());
    }
}
