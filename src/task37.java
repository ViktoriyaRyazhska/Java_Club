import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.IntStream;

public class task37 {
    public static int[] reverse(int n){
        if (n < 0) {
            throw new IllegalArgumentException("Your number is under zero");
        }
        return IntStream.rangeClosed(1, n)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(i -> i)
                .toArray();
    }

    public static void execute(Scanner sc) {
        System.out.println("This programs returns an array of integers from n to 1");
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Here your array: " + Arrays.toString(reverse(n)));
    }
}
