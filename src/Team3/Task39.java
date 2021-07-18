package Team3;

import java.util.Arrays;
import java.util.Scanner;

public class Task39 {
    public static int grow(int[] x){
        int first = x[0];
        for(int i=1;i<x.length;i++){
            first*=x[i];
        }
        return first;

    }

    public static void showFunctionality() {
        System.out.println("This program  returns the result of multiplying the values together in order");
        Scanner n = new Scanner(System.in);
        System.out.println("Введіть кількість чисел масиву:");
        int m = n.nextInt();
        int []arr1 = new int[m];
        for(int i=0;i<m;i++){
            System.out.println("Введіть "+(i+1)+" число масиву");
            arr1[i]=n.nextInt();
        }
        System.out.println(grow(arr1));
    }
}
