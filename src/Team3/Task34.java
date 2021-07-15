package Team3;

import java.util.Scanner;

public class Task34 {
    public static int getAverage(int[] marks){
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        return sum/(marks.length);
    }
    public static void showFunctionality(){

        System.out.println("This program calculates average number from array");
        System.out.println("Enter size of array");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] arr = new int [n];
        for (int i = 0; i < arr.length ; i++) {
            System.out.println("Enter number [" + i + "] :");
            arr[i] = in.nextInt();
        }
        System.out.println("Average number is : " + getAverage(arr));

    }
}
