import java.util.Scanner;

public class Dinglemouse {
    public static final Dinglemouse INST = new Dinglemouse();

    private static int ONE_HUNDRED = 100;

    private final int value;

    private Dinglemouse() {
        value = ONE_HUNDRED;
    }

    public int plus100(int n) {
        n=100;
        return value + n;
    }
    public static void execute(Scanner sc) {
        System.out.println("This program add one hundred to number ");

    }
}
