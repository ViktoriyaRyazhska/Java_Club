import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class task60 {
    public static String fakeBin(String numberString) {
        return numberString.isEmpty() ? numberString :
                Arrays.stream(numberString.split(""))
                .mapToInt(Integer::parseInt)
                .map(i -> i = i < 5 ? 0 : 1)
                .mapToObj(Integer::toString)
                .collect(Collectors.joining());
    }

    public static void execute(Scanner sc) {
        System.out.println("This program replaces any digit below 5 with '0' and any digit 5 and above with '1' \n" +
                "and returns the resulting string");
        System.out.println("Enter string like this \"45385593107843568\": ");
        String str = sc.next();
        System.out.println(fakeBin(str));
    }
}
