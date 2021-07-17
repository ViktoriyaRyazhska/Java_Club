import java.util.Scanner;

public class task32 {
    public static String repeatStr(final int repeat, final String string) {
        if (string.isEmpty()) {
            throw new IllegalArgumentException("String is empty. Nothing to repeat.");
        }
        return string.repeat(repeat);
    }

    public static void execute(Scanner sc) {
        System.out.println("This program repeats the given string string exactly n times");
        System.out.println("Enter n variable: ");
        int n = sc.nextInt();
        System.out.println("Enter string: ");
        String str = sc.next();
        String result = repeatStr(n, str);
        System.out.println("Your string: " + result);
    }
}
