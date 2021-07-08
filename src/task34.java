import java.util.Scanner;

public class task34 {
    public static int getAverage(int[] marks){
        if (marks.length == 0) {
            throw new RuntimeException();
        }

        int sum = 0;
        
        for(int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }

        return sum/marks.length;
    }

    public static void execute(Scanner sc) {
        System.out.println("This method helps you to calculate average mark in a class");
        System.out.println("Enter the number of marks: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter mark: ");
            array[i] = sc.nextInt();
        }
        int average = getAverage(array);
        System.out.println("Average mark is " + average);
    }
}
