import java.util.Scanner;

public class task6 {
    public static int toBinary(int n) {
        return Integer.parseInt(Integer.toBinaryString(n));
    }

    public static void execute(Scanner sc) {
        System.out.println("This method parses int to binary.\nPlease enter int number: ");
        int n = sc.nextInt();
        int result = toBinary(n);
        System.out.println("Here your result: " + result);
    }
}
