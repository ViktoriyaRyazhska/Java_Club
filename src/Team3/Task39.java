package Team3;

import java.util.Arrays;
import java.util.Scanner;

public class Task39 {
    public static void multiplyArray(){
        System.out.println("enter the number of the digits: ");
        Scanner scaner = new Scanner(System.in);
        int n = scaner.nextInt();
        int[]array = new int[n];
        Scanner console = new Scanner(System.in);

        for(int i=0;i<n;i++) {
            System.out.println("Введіть "+(i+1)+" число масиву");
            array[i]=console.nextInt();
        }
        int first = array[0];
        for(int j=1;j<n;j++){
            first*= array[j];
        }
        System.out.println("Your multiplied array: ");
        System.out.println(first);
    }
    public static void showFunctionality() {
        System.out.println("This program  returns the result of multiplying the values together in order");
        multiplyArray();
    }
}
