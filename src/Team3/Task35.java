package Team3;

import java.util.Arrays;
import java.util.Scanner;

public class Task35 {

    public static String map(int[] arr) {
        for(int i=0;i<arr.length;i++){
            arr[i]*=2;
        }
        return Arrays.toString(arr);
    }

    public static void showFunctionality() {
        System.out.println("This program returns your array with each value doubled.");
        Scanner n = new Scanner(System.in);
        System.out.println("Введіть кількість чисел масиву:");
        int m = n.nextInt();
        int []arr1 = new int[m];
        for(int i=0;i<m;i++){
            System.out.println("Введіть "+(i+1)+" число масиву");
            arr1[i]=n.nextInt();
        }
        System.out.println(map(arr1));

    }
}
