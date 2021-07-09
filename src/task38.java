import java.util.Scanner;

public class task38 {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int sum = 0;
        int[] newClassPoints = new int[classPoints.length+1];

        System.arraycopy(classPoints, 0, newClassPoints, 1, classPoints.length);

        classPoints[0] = yourPoints;

        for(int i = 0; i < classPoints.length; i++) {
            sum += classPoints[i];
        }

        return sum / classPoints.length < yourPoints;
    }

    public static void execute(Scanner sc) {
        System.out.println("This method checks if your mark better then average");
        System.out.println("Enter the number of marks: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter mark: ");
            array[i] = sc.nextInt();
        }
        System.out.println("Now, enter your mark: ");
        int m = sc.nextInt();
        boolean result = betterThanAverage(array, m);
        System.out.println(result);
    }
}
