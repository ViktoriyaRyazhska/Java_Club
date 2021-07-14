import java.util.Scanner;

public class task4 {

    public static boolean isDivisible(int wallLength, int pixelSize) {
        return wallLength % pixelSize == 0;
    }

    public static void execute(Scanner sc) {
        System.out.println("This program tells you if a wall of a certain length can accurately hold an integer number of pixels of a certain length");
        System.out.println("Enter wall length: ");
        int w = sc.nextInt();
        System.out.println("Enter pixel size: ");
        int p = sc.nextInt();
        System.out.println("Your result is " + isDivisible(w, p));
    }
}
