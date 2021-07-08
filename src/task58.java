import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class task58 {
    public static String tripleTrouble(String one, String two, String three) {
        return IntStream.range(0, one.length())
                .mapToObj(i -> "" + one.charAt(i) + two.charAt(i) + three.charAt(i))
                .collect(Collectors.joining());
    }

    public static void execute(Scanner sc) {
        System.out.println("This method returns a string that combines \n" +
                "all of the letters of the three inputted strings in groups.");
        System.out.println("Like that Input: \"aa\", \"bb\" , \"cc\" => Output: \"abcabc\"");
        System.out.println("You need to enter three strings: ");
        String one = sc.next();
        String two = sc.next();
        String three = sc.next();
        String result = tripleTrouble(one, two, three);
        System.out.println("Your result is " + result);
    }
}
