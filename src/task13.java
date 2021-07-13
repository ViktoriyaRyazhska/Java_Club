import java.util.Scanner;

public class task13 {
    public static final task13 INST = new task13();

    private static int ONE_HUNDRED = 100;

    private final int value;

    private task13() {
        value = ONE_HUNDRED;
    }

    public int plus100(int n) {
        n=100;
        return value + n;
    }
    public static void execute(Scanner sc) {
        System.out.println("This program add one hundred to number ");
        System.out.println("Pleas enter your number");
        int number = sc.nextInt();
        int result = INST.plus100(number);
        System.out.println(result);
    }
}
