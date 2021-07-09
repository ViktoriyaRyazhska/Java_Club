import java.util.Scanner;

public class task26 {
    public static String boolToWord(boolean b)
    {
        return b ? "Yes" : "No";
    }

    public static void execute(Scanner sc) {
        System.out.println("This method convert 'true' or 'false' to 'Yes' or 'No'");
        System.out.println("To put 'true' press 1, 'false' press 2: ");
        int n = sc.nextInt();
        String result;
        if (n == 1) {
            result = boolToWord(true);
        } else {
            result = boolToWord(false);
        }
        System.out.println("Your result: " + result);
    }
}
