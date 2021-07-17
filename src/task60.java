import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class task60 {
    public static String fakeBin(String numberString) {
        if (numberString.isEmpty())
            throw new IllegalArgumentException("This string is empty. There is nothing to convert!");


        return Arrays.stream(numberString.split(""))
                .filter(Objects::nonNull)
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
