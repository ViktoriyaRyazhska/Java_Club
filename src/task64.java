import java.util.Scanner;

public class task64 {
    public static int strCount(String str, char letter) {
        return (int) str.chars().filter(x -> x == letter).count();
    }

    public static void execute(Scanner sc) {
        System.out.println("This program accepts 2 string arguments and returns an integer of the count of occurrences \n" +
                "the 2nd argument is found in the first one.\n" +
                "\n" +
                "If no occurrences can be found, a count of 0 should be returned.");
        System.out.println("Enter string: ");
        String str = sc.next();
        System.out.println("Enter character: ");
        char c = sc.next().charAt(0);
        System.out.println("Your symbol occurred " + strCount(str, c) + " times");
    }
}
