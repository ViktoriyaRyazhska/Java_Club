import java.util.Scanner;

public class task52 {
    public static String solution(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return solution(str.substring(1)) + str.charAt(0);
    }

    public static void execute(Scanner sc) {
        System.out.println("This program reverses the string passed into it");
        System.out.println("Enter your string: ");
        String str = sc.next();
        System.out.println("Your result is " + solution(str));
    }
}
