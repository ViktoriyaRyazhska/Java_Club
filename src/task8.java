import java.util.Scanner;

public class task8 {
    public static int century(int number) {
        return (number + 99) / 100;
    }

    public static void execute(Scanner sc) {
        System.out.println("This method calculates century");
        System.out.println("Please enter year: ");
        int year = sc.nextInt();
        int result = century(year);
        System.out.println("Your result is " + result);
    }
}
