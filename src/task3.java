import java.util.Scanner;

public class task3 {
    public static double getVolumeOfCuboid(final double length, final double width, final double height) {
        double s = length * width * height;
        return s;
    }
    public static void execute(Scanner sc) {
        System.out.println("This program shows love when the petals on the flower are the exact number or not accurate ");
        System.out.println("Pleas enter your length");
        double length = sc.nextDouble();
        sc.nextLine();
        System.out.println("Pleas enter your width");
        double width = sc.nextDouble();
        sc.nextLine();
        System.out.println("Pleas enter your height");
        double height = sc.nextDouble();
        sc.nextLine();
        double result = getVolumeOfCuboid(length,width,height);
        System.out.println(result);
    }
}
