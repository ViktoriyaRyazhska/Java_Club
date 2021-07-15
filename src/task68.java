import java.util.Scanner;

public class task68 {
    public static String remove(String s, int n){
        while (n-- > 0)
            s = s.replaceFirst("!", "");

        return s;
    }

    public static void execute(Scanner sc) {
        System.out.println("This program removes n exclamation marks in the sentence from left to right. n is positive integer");
        System.out.println("Enter string with \"!\": ");
        String str = sc.next();
        System.out.println("Enter how many \"!\" do you want to delete: ");
        int n = sc.nextInt();
        System.out.println("Your string after manipulations: " + remove(str, n));
    }

}
