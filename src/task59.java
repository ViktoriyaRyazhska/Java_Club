import java.util.Scanner;

public class task59 {
    public static String position(char alphabet) {

        if (alphabet >= 'a' && alphabet <= 'z')
            return "Position of alphabet: " + (alphabet - 96);

        throw new IllegalArgumentException("This symbol is not a lowercase letter!");
    }

    public static void execute(Scanner sc) {
        System.out.println("This program finds letter position at alphabet");
        System.out.println("Enter any letter: ");
        char letter = sc.next().charAt(0);
        System.out.println(position(letter));
    }
}
