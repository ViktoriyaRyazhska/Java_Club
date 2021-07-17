import java.util.NoSuchElementException;
import java.util.Scanner;

public class task68 {
    public static String remove(String s, int n){

        if (s.isEmpty() || n < 0)
            throw new IllegalArgumentException("This string is empty or amount of exclamation marks to delete is less than zero");

        int amount = (int) s.chars()
                                .mapToObj(c -> (char) c)
                                .map(Object::toString)
                                .filter(c -> c.equals("!"))
                                .count();

        if (amount == 0) {
            throw new NoSuchElementException("There is nothing to delete!");
        } else if (n > amount) {
            throw new NoSuchElementException("The number of exclamation marks you want to remove exceeds the number of existing ones");
        }

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
