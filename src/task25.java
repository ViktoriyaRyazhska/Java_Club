import java.util.Scanner;

public class task25 {
    public static boolean isLove(final int flower1, final int flower2) {

        if (flower1 % 2 == 0 && flower2 % 2 == 1 || flower1 % 2 == 1 && flower2 % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void execute(Scanner sc) {
        System.out.println("This program shows love when the petals on the flower are the exact number or not accurate ");
        System.out.println("Pleas enter your first numbers");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.println("Pleas enter your second number");
        int number2 = sc.nextInt();
        sc.nextLine();
        boolean result = isLove(number,number2);
        System.out.println(result);
    }
}
