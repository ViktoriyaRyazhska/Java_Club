import java.util.Arrays;
import java.util.Scanner;

public class task40 {
    public static int sum(int[] arr){
        return Arrays.stream(arr)
                .filter(v -> v >= 0)
                .sum();
    }


    public static void execute(Scanner sc) {
        System.out.println("This program returns the sum of all of the positives ones in array");
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter value to array["+ i +"]: ");
            int n = sc.nextInt();
            arr[i] = n;
        }

        System.out.println("Your result is " + sum(arr));
    }
}
